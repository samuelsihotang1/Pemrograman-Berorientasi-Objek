package fintech.model;

import java.util.Date;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class RevertTransaction extends Transaction {
  private int idRevert;

  public RevertTransaction(int idTransaction, String accountName, int idRevert, double amount, Date posted_at,
      String note) {
    super(idTransaction, accountName, amount, posted_at, note);
    this.idRevert = idRevert;
  }

  public int getIdRevert() {
    return this.idRevert;
  }

}
