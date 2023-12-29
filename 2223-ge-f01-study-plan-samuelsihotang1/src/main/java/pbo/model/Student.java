package pbo.model;

import java.util.*;
import javax.persistence.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

@Entity
@Table(name = "Student")
public class Student {

  @Id
  @Column(name = "NIM", nullable = false, length = 100)
  private String NIM;

  @Column(name = "nama", nullable = false, length = 100)
  private String nama;

  @Column(name = "prodi", nullable = false, length = 100)
  private String prodi;

  public Student() {
  }

  public Student(String NIM, String nama, String prodi) {
    this.NIM = NIM;
    this.nama = nama;
    this.prodi = prodi;
  }

  public String getNama() {
    return this.nama;
  }

  public String getNIM() {
    return this.NIM;
  }

  public String getProdi() {
    return this.prodi;
  }
}