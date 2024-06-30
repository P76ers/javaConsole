package javaConsole.vorlesung.grundlagen.exceptions;

import java.util.Scanner;

public class BetragEingeben {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double betrag = 0;

    System.out.println("Bitte Betrag eingeben");

    try {
      betrag = scanner.nextDouble();
    } catch (Exception e) {
      System.out.println("Ausnahme wurde ausgelöst: " + e);
    } finally {
      scanner.close();
    }
    System.out.println("betrag = " + betrag);

    // Test der eigenen Exception
    TestException testException = new TestException();

    try {
      testException.eigeneAusnahme();
    } catch (TestException e) {
      System.out.println(e);
    }
  }
}
