package fintech.model;
import java.util.Comparator;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class AccountComparator implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        return a1.getAccountName().compareTo(a2.getAccountName());
    }
}