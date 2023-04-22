package fintech.model;
import fintech.model.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Transaction {
  private final int idTransaction = 1;
  private final String owner;
  private final double amount;
  private final String posted_at;
  private final String note;

  public Transaction(String _owner, double _amount, String _posted_at, String _note)
  {
    this.owner = _owner;
    this.amount = _amount;
    this.posted_at = _posted_at;
    this.note = _note;
  }

  @Override
  public String toString()
  {
    return this.idTransaction + "|" + this.owner + "|" + this.amount + "|" + this.posted_at + "|" + this.note + "|" + this.amount;
  }

}