package pbo.model;

import javax.persistence.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

@Entity
@Table(name = "Enroll")
public class Enroll {

  @Id
  @Column(name = "ide", nullable = false, length = 100)
  public int ide;

  @Column(name = "NIMM", nullable = false, length = 100)
  public String NIMM;

  @Column(name = "idCoursee", nullable = false, length = 100)
  public String idCoursee;

  public Enroll() {
  }

  public Enroll(int ide, String NIMM, String idCoursee) {
    this.ide = ide;
    this.NIMM = NIMM;
    this.idCoursee = idCoursee;
  }

  public String getIdCoursee() {
    return this.idCoursee;
  }

  public String getNIMM() {
    return this.NIMM;
  }

  public int getide() {
    return this.ide;
  }
}