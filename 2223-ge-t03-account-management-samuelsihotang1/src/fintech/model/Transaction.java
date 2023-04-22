package fintech.model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Transaction {
  private int idTransaction;
  private String accountName;
  private double amount;
  private Date posted_at;
  private String note;

  public Transaction(int idTransaction, String accountName, double amount, Date posted_at, String note)
  {
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
  
  public String getPosted_at() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String outputDate = dateFormat.format(this.posted_at);
    return outputDate;
  }

  public String getNote() {
    return this.note;
  }
}