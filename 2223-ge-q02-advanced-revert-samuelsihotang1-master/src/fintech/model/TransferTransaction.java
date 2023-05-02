
package fintech.model;

import java.util.Date;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class TransferTransaction extends Transaction {
  private String accountName2;

  public TransferTransaction(int idTransaction, String accountName, String accountName2, double amount, Date posted_at,
      String note) {
    super(idTransaction, accountName, amount, posted_at, note);
    this.accountName2 = accountName2;
  }

  public String getAccountName2() {
    return this.accountName2;
  }

}
