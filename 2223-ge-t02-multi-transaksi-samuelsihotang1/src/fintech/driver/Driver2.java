package fintech.driver;
import java.util.*;
import fintech.model.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Driver2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (masukan.hasNext()) {
            String input = masukan.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] inputArr = input.split("#");
            String command = inputArr[0];

            if (command.equals("create-account")) {
                String owner = inputArr[1];
                String accountName = inputArr[2];
                Account account = new Account(owner, accountName);
                accounts.add(account);
                System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            } else if (command.equals("find-account")) {
                String accountName = inputArr[1];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                    if (account.getAccountName().toLowerCase().equals(searchKey)) {
                        System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
                    }
                }
            }
        }
        masukan.close();
    }
}