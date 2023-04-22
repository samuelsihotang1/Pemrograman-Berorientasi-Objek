package fintech.driver;
import java.util.ArrayList;
import java.util.Scanner;
import fintech.model.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Driver1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        
        while (masukan.hasNext()) {
            // membaca masukan
            String input = masukan.nextLine();
            
            // menghentikan aplikasi jika diberi sebaris masukan
            if (input.equals("---")) {
                break;
            }
            
            // memecah masukan menjadi tiga segmen
            String[] inputSegments = input.split("#");
            String command = inputSegments[0];
            String owner = inputSegments[1];
            String accountName = inputSegments[2];
            
            if (command.equals("create-account")) {
                // membuat objek Account
                Account account = new Account(owner, accountName);
                
                // menambah akun ke dalam ArrayList accounts
                accounts.add(account);
                System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            }
        }
        masukan.close();
    }
}