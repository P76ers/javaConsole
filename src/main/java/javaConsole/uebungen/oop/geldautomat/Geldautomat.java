package javaConsole.uebungen.oop.geldautomat;

import java.util.Scanner;

public class Geldautomat {
  private static Konto konto = new Konto(9.99);

  public void kontostand() {
    System.out.println("Ihr aktueller Kontostand beträgt: " + konto.getGuthaben() + "€");
  }

  public void abheben() {
    double betrag = 0.0;
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Abhebungsbetrag eingeben:");
      betrag = scanner.nextDouble();
      if (betrag <= konto.getGuthaben()) {
        System.out.println("Sie haben " + betrag + "€ abgehoben");
        konto.setGuthaben(konto.getGuthaben() - betrag);
      } else {
        System.out.println("Buchung fehlgeschlagen mangels nicht ausreichender Deckung");
      }
    } catch (Exception e) {
      System.out.println("Abhebung fehlgeschlagen!");
    } finally {
      kontostand();
    }
  }

}
