package javaConsole.uebungen.oop.account;

import java.util.Scanner;

public class AccountApp {
  public static void main(String[] args) {
    Account account1 = new Account("Peter", "peter@parker.de", 12);
    Account account2 = new Account("Clark", "clark@kent.de", 13);
    Account account3 = new Account("Bruce", "bruce@wayne.de", 12);

    Account[] accounts = {account1, account2, account3};

    for (Account account : accounts) {
      account.DetailsAusgeben();
    }

    neuerAccount();
  }

  static void neuerAccount() {
    Account account;
    String name, email;
    int alter;
    Scanner scanner = new Scanner(System.in);

    System.out.println("*** Neuer Account, bitte Daten angeben ***");
    System.out.println("Name:");
    name = scanner.next();

    System.out.println("Email:");
    email = scanner.next();

    System.out.println("Alter:");
    alter = scanner.nextInt();

    account = new Account(name, email, alter);
    account.DetailsAusgeben();
  }

}
