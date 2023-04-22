package fintech.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import fintech.model.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Driver2 {
  public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    TransactionComparator comparatorTransaction = new TransactionComparator();
    AccountComparator comparatorAccount = new AccountComparator();
    int idTransaction = 0;
    boolean isSame = false;

    while (masukan.hasNext()) {
      isSame = false;
      String input = masukan.nextLine();
      if (input.equals("---")) {
        break;
      }

      String[] inputArr = input.split("#");
      String command = inputArr[0];

      if (command.equals("remove-account")) {
        String accountName = inputArr[1];
        for (int i = accounts.size() - 1; i >= 0; i--) {
          Account account = accounts.get(i);
          if (account.getAccountName().equalsIgnoreCase(accountName)) {
            accounts.remove(i);
            for (int j = transactions.size() - 1; j >= 0; j--) {
              Transaction transaction = transactions.get(j);
              if (transaction.getAccountName().equalsIgnoreCase(accountName)) {
                transactions.remove(j);
              }
            }
          }
        }
      } else if (command.equals("create-account")) {
        String owner = inputArr[1];
        String accountName = inputArr[2];
        for (Account account : accounts) {
          if (account.getAccountName().toLowerCase().equals(accountName)) {
            isSame = true;
            break;
          }
        }
        if (!isSame) {
          Account account = new Account(owner, accountName);
          accounts.add(account);
          System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
        }
      } else if (command.equals("find-account")) {
        String accountName = inputArr[1];
        String searchKey = accountName.toLowerCase();
        for (Account account : accounts) {
          if (account.getAccountName().toLowerCase().equals(searchKey)) {
            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            break;
          }
        }
      } else if (command.equals("show-account")) {
        String accountName = inputArr[1];
        String searchKey = accountName.toLowerCase();
        for (Account account : accounts) {
          if (account.getAccountName().toLowerCase().equals(searchKey)) {
            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            break;
          }
        }
        Collections.sort(transactions, comparatorTransaction);
        for (Transaction transaction : transactions) {
          if (transaction.getAccountName().toLowerCase().equals(searchKey)) {
            System.out.println(transaction.getIdTransaction() + "|" + transaction.getAccountName() + "|"
                + transaction.getAmount() + "|" + transaction.getPosted_at() + "|" + transaction.getNote());
          }
        }
      } else if (command.equals("show-accounts")) {
        Collections.sort(transactions, comparatorTransaction);
        Collections.sort(accounts, comparatorAccount);
        for (Account account : accounts) {
          System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
          String searchKey = account.getAccountName();
          for (Transaction transaction : transactions) {
            if (transaction.getAccountName().toLowerCase().equals(searchKey)) {
              System.out.println(transaction.getIdTransaction() + "|" + transaction.getAccountName() + "|"
                  + transaction.getAmount() + "|" + transaction.getPosted_at() + "|" + transaction.getNote());
            }
          }
        }
      } else if (command.equals("create-transaction")) {
        String accountName = inputArr[1];
        double amount = Double.parseDouble(inputArr[2]);
        Date posted_at = null;
        try {
          posted_at = dateFormat.parse(inputArr[3]);
        } catch (ParseException e) {
          e.printStackTrace();
        }
        String note = inputArr[4];
        String searchKey = accountName.toLowerCase();
        idTransaction++;
        for (Account account : accounts) {
          if (account.getAccountName().toLowerCase().equals(searchKey)) {
            account.addBalance(amount);
            Transaction transaction = new Transaction(idTransaction, accountName, amount, posted_at, note);
            transactions.add(transaction);
            break;
          }
        }
      }
    }
    masukan.close();
  }
}
