package pbo.model;

import java.util.*;
import javax.persistence.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

@Entity
@Table(name = "Course")
public class Course {
  @Id
  @Column(name = "idCourse", nullable = false, length = 100)
  private String idCourse;

  @Column(name = "courseName", nullable = false, length = 100)
  private String courseName;

  @Column(name = "semester", nullable = false, length = 100)
  private String semester;

  @Column(name = "kredit", nullable = false, length = 100)
  private String kredit;

  public Course() {
  }

  public Course(String idCourse, String courseName, String semester, String kredit) {
    this.idCourse = idCourse;
    this.courseName = courseName;
    this.semester = semester;
    this.kredit = kredit;
  }

  public String getIdCourse() {
    return this.idCourse;
  }

  public String getCourseName() {
    return this.courseName;
  }

  public String getSemester() {
    return this.semester;
  }

  public String getKredit() {
    return this.kredit;
  }
}
