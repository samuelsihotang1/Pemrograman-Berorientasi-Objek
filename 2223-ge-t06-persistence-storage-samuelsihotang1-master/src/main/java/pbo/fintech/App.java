package pbo.fintech;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import pbo.fintech.model.*;

/**
 * 12S21041 - Samuel Christy Angie Sihotang
 * 12S21052 - Griselda
 * 
 * To compile:
 * mvn clean compile assembly:single
 * 
 * To run:
 * java -cp .\target\fintech-1.0-SNAPSHOT-jar-with-dependencies.jar
 * pbo.fintech.App
 */
public class App {

  private static EntityManagerFactory factory;
  private static EntityManager entityManager;

  public static void main(String[] _args) {
    Scanner masukan = new Scanner(System.in);

    factory = Persistence.createEntityManagerFactory("fintech_pu");
    entityManager = factory.createEntityManager();

    while (masukan.hasNext()) {
      String input = masukan.nextLine();
      if (input.equals("---")) {
        break;
      }

      String[] inputArr = input.split("#");
      String command = inputArr[0];

      if (command.equals("remove-account")) {
        String accountName = inputArr[1];
        accountName = accountName.toLowerCase();
        entityManager.getTransaction().begin();

        entityManager.createQuery("DELETE FROM Account account WHERE account.accountName = :accountName", Account.class)
            .setParameter("accountName", accountName).executeUpdate();
        entityManager.getTransaction().commit();

        List<Transaction> transactions = entityManager.createQuery(
            "SELECT transaction FROM Transaction transaction WHERE transaction.accountName = :accountName",
            Transaction.class)
            .setParameter("accountName", accountName)
            .getResultList();
        if (!transactions.isEmpty()) {
          entityManager
              .createQuery("DELETE FROM Transaction transaction WHERE transaction.accountName = :accountName",
                  Transaction.class)
              .setParameter("accountName", accountName).executeUpdate();
          entityManager.getTransaction().commit();
        }

      } else if (command.equals("create-account")) {
        String owner = inputArr[1];
        String accountName = inputArr[2];
        accountName = accountName.toLowerCase();

        List<Account> accounts = entityManager.createQuery(
            "SELECT account FROM Account account WHERE account.accountName = :accountName", Account.class)
            .setParameter("accountName", accountName)
            .getResultList();

        if (accounts.isEmpty()) {
          Account account = new Account(owner, accountName);

          entityManager.getTransaction().begin();
          entityManager.persist(account);
          entityManager.getTransaction().commit();

          System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
        }
      } else if (command.equals("show-accounts")) {
        List<Account> accounts = entityManager.createQuery(
            "SELECT account FROM Account account ORDER BY account.accountName ASC", Account.class)
            .getResultList();
        for (Account account : accounts) {
          System.out.println(account.getAccountName() + "|" + account.getOwner() + "|"
              + String.format("%.1f", account.getBalance()));
          List<Transaction> transactions = entityManager.createQuery(
              "SELECT transaction FROM Transaction transaction WHERE transaction.accountName = :accountName ORDER BY transaction.posted_at",
              Transaction.class)
              .setParameter("accountName", account.getAccountName())
              .getResultList();
          for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            System.out.println(transaction.getIdTransaction() + "|" + transaction.getAccountName() + "|"
                + transaction.getAmount() + "|" + transaction.getPosted_at() + "|" + transaction.getNote());
          }
        }
      }
    }
    entityManager.getTransaction().begin();
    entityManager.createQuery("DELETE FROM Account account").executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.getTransaction().begin();
    entityManager.createQuery("DELETE FROM Transaction transaction").executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.close();
    masukan.close();
  }
}