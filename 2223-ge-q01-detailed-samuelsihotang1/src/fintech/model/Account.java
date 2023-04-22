package fintech.model;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

public class Account {
    private String owner;
    private String accountName;
    private double balance;
    
    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public String getAccountName() {
        return this.accountName;
    }
    
    public double getBalance() {
        return this.balance;
    }

    public void addBalance(double amount) {
      this.balance += amount;
    }
}