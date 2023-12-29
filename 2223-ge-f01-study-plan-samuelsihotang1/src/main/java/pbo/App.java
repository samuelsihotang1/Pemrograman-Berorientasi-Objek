package pbo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import java.util.Scanner;

import pbo.model.*;

/**
 * Main class
 *
 */
public class App {

  private static EntityManagerFactory factory;
  private static EntityManager entityManager;

  public static void main(String[] _args) {
    Scanner masukan = new Scanner(System.in);

    factory = Persistence.createEntityManagerFactory("study_plan_pu");
    entityManager = factory.createEntityManager();

    int ide = 0;

    while (masukan.hasNext()) {
      String input = masukan.nextLine();
      if (input.equals("---")) {
        break;
      }

      String[] inputArr = input.split("#");
      String command = inputArr[0];
      if (command.equals("student-add")) {
        String NIM = inputArr[1];
        String nama = inputArr[2];
        String prodi = inputArr[3];

        List<Student> students = entityManager.createQuery(
            "SELECT student FROM Student student WHERE student.NIM = :NIM", Student.class)
            .setParameter("NIM", NIM)
            .getResultList();

        if (students.isEmpty()) {
          Student student = new Student(NIM, nama, prodi);

          entityManager.getTransaction().begin();
          entityManager.persist(student);
          entityManager.getTransaction().commit();
        }
      } else if (command.equals("student-show")) {
        String NIM = inputArr[1];
        List<Student> students = entityManager.createQuery(
            "SELECT student FROM Student student WHERE student.NIM = :NIM", Student.class)
            .setParameter("NIM", NIM)
            .getResultList();
        for (Student student : students) {
          System.out.println(student.getNIM() + "|" + student.getNama() + "|" + student.getProdi());
          List<Enroll> enrolls = entityManager.createQuery(
              "SELECT enroll FROM Enroll enroll WHERE enroll.NIMM = :NIM ORDER BY enroll.idCoursee ASC", Enroll.class)
              .setParameter("NIM", student.getNIM())
              .getResultList();
          for (Enroll enroll : enrolls) {
            List<Course> courses = entityManager.createQuery(
                "SELECT course FROM Course course WHERE course.idCourse = :idCourse", Course.class)
                .setParameter("idCourse", enroll.getIdCoursee())
                .getResultList();
            for (Course course : courses) {
              System.out.println(course.getIdCourse() + "|" + course.getCourseName() + "|" + course.getSemester() + "|"
                  + course.getKredit());
            }
          }
        }
      } else if (command.equals("student-show-all")) {
        List<Student> students = entityManager.createQuery(
            "SELECT student FROM Student student ORDER BY student.NIM ASC", Student.class)
            .getResultList();
        for (Student student : students) {
          System.out.println(student.getNIM() + "|" + student.getNama() + "|" + student.getProdi());
        }
      } else if (command.equals("course-add")) {
        String idCourse = inputArr[1];
        String courseName = inputArr[2];
        String semester = inputArr[3];
        String kredit = inputArr[4];

        List<Course> courses = entityManager.createQuery(
            "SELECT course FROM Course course WHERE course.idCourse = :idCourse", Course.class)
            .setParameter("idCourse", idCourse)
            .getResultList();

        if (courses.isEmpty()) {
          Course course = new Course(idCourse, courseName, semester, kredit);

          entityManager.getTransaction().begin();
          entityManager.persist(course);
          entityManager.getTransaction().commit();
        }
      } else if (command.equals("course-show-all")) {
        List<Course> courses = entityManager.createQuery(
            "SELECT course FROM Course course ORDER BY course.idCourse ASC", Course.class)
            .getResultList();
        for (Course course : courses) {
          System.out.println(course.getIdCourse() + "|" + course.getCourseName() + "|" + course.getSemester() + "|"
              + course.getKredit());
        }
      } else if (command.equals("enroll")) {
        String NIMM = inputArr[1];
        String idCoursee = inputArr[2];
        ide++;
        Enroll enroll = new Enroll(ide, NIMM, idCoursee);

        entityManager.getTransaction().begin();
        entityManager.persist(enroll);
        entityManager.getTransaction().commit();
      }
    }
    entityManager.getTransaction().begin();
    entityManager.createQuery("DELETE FROM Student student").executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.getTransaction().begin();
    entityManager.createQuery("DELETE FROM Course course").executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.getTransaction().begin();
    entityManager.createQuery("DELETE FROM Enroll enroll").executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.close();
    masukan.close();
  }
}