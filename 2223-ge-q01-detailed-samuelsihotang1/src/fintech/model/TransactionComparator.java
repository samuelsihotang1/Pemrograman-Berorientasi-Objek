package fintech.model;
import java.util.Comparator;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class TransactionComparator implements Comparator<Transaction> {
    public int compare(Transaction t1, Transaction t2) {
        return t1.getPosted_at().compareTo(t2.getPosted_at());
    }
}