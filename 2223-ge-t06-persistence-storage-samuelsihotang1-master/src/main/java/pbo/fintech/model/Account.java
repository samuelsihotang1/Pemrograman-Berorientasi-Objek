package pbo.fintech.model;

import java.util.*;
import javax.persistence.*;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author 12S21052 Griselda
 */

@Entity
@Table(name = "Account")
public class Account {

  @Id
  @Column(name = "accountName", nullable = false, length = 256)
  private String accountName;

  @OneToMany(mappedBy = "accounts", cascade = CascadeType.ALL)
  private Set<Transaction> transactions;

  @Column(name = "owner", nullable = false, length = 256)
  private String owner;

  @Column(name = "balance", nullable = false, length = 256)
  private double balance;

  public Account() {
    
  }

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

  public void removeBalance(double amount) {
    this.balance -= amount;
  }

  public void BalanceTest(double amount) throws Exception {
    if ((amount < 0 && this.getBalance() + amount > 0) || (amount > 0)) {
      throw new Exception("Berikan Izin");
    } else {
      throw new Exception("False");
    }
  }

  public void TransferTest(double amount) throws Exception {
    if (amount > 0 && this.getBalance() - amount > 0) {
      throw new Exception("Berikan Izin");
    } else {
      throw new Exception("False");
    }
  }

  public Set<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(Set<Transaction> transactions) {
    this.transactions = transactions;
  }

  public void addTransaction(Transaction transaction) {
    transactions.add(transaction);
    transaction.setAccount(this);
  }
}