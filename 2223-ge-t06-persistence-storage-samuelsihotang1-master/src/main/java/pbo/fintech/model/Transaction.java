package pbo.fintech.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

@Entity
@Table(name = "Transaction")
public class Transaction {
  @Id
  @Column(name = "idTransaction", nullable = false, length = 256)
  private int idTransaction;

  @ManyToOne
  @JoinColumn(name = "accountName", referencedColumnName = "accountName", insertable = false, updatable = false)
  private Account accounts;

  @Column(name = "accountName", nullable = false, length = 256)
  private String accountName;

  @Column(name = "amount", nullable = false, length = 256)
  private double amount;

  @Column(name = "posted_at", nullable = false, length = 256)
  private Date posted_at;

  @Column(name = "note", nullable = false, length = 256)
  private String note;

  public Transaction() {

  }

  public Transaction(int idTransaction, String accountName, double amount, Date posted_at, String note) {
    this.idTransaction = idTransaction;
    this.accountName = accountName;
    this.amount = amount;
    this.posted_at = posted_at;
    this.note = note;
  }

  public int getIdTransaction() {
    return this.idTransaction;
  }

  public String getAccountName() {
    return this.accountName;
  }

  public double getAmount() {
    return this.amount;
  }

  public Date getDate() {
    return this.posted_at;
  }

  public String getPosted_at() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String outputDate = dateFormat.format(this.posted_at);
    return outputDate;
  }

  public String getNote() {
    return this.note;
  }

  public void RevertTest(Date Terakhir) throws Exception {
    long jarak = (Terakhir.getTime() - this.getDate().getTime()) / (60000);
    if (jarak < 10) {
      throw new Exception("Berikan Izin Revert");
    } else {
      throw new Exception("False");
    }
  }

  public void setAccount(Account account) {
    this.accounts = account;
  }
}