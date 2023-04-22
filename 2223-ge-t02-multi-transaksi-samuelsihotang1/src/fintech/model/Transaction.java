package fintech.model;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Transaction {
  private String accountName;
  private double amount;
  private String posted_at;
  private String note;

  public Transaction(String accountName, double amount, String posted_at, String note)
  {
    this.accountName = accountName;
    this.amount = amount;
    this.posted_at = posted_at;
    this.note = note;
  }

  public String getAccountName() {
    return this.accountName;
  }
  
  public double getAmount() {
    return this.amount;
  }
  
  public String getPosted_at() {
    return this.posted_at;
  }
  
  public String getNote() {
    return this.note;
  }
}