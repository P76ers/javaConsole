package javaConsole.uebungen.grundlagen;

public class Uebung041 {
  public static void main(String[] args) {
    int bestellmenge = 1;
    int bestand = 2;
    boolean zahlung = false;

    if (bestellmenge <= bestand & zahlung == true) {
      System.out.println("Ware wurde versendet");
    } else if (bestellmenge <= bestand & zahlung != true) {
      System.out.println("Ware wird nach Zahlungseingang versendet");
    } else if (bestellmenge > bestand) {
      System.out.println("Es sind nur " + bestand + "x Artikel vorhanden");
    }
  }
}
