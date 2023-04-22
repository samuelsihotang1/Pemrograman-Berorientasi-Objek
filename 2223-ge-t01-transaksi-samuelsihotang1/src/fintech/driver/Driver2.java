package fintech.driver;

import java.util.Scanner;
import fintech.model.*;
/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */
public class Driver2 {

  public static void main(String[] _args) {

    Scanner input = new Scanner(System.in);
    String command = input.nextLine();
    String name = input.nextLine();
    String owner = input.nextLine();

    Account account = new Account(owner, name);
    System.out.println(account);

    command = input.nextLine();
    owner = input.nextLine();
    double amount = Double.parseDouble(input.nextLine());
    String posted_at = input.nextLine();
    String note = input.nextLine();

    Transaction transaction = new Transaction(owner, amount, posted_at, note);
    System.out.println(transaction);

    input.close();
  }
}