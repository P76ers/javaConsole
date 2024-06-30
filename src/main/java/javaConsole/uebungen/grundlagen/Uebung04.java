package javaConsole.uebungen.grundlagen;

public class Uebung04 {
  public static void main(String[] args) {
    boolean stammKunde = true;
    String name = "John Conner";
    double einkaufswert = 1000.00;
    double rabatt;

    if (stammKunde && name.equals("John Conner")) {
      if (einkaufswert >= 3000) {
        einkaufswert *= 0.9;
      } else if (einkaufswert >= 2000) {
        einkaufswert *= 0.95;
      } else if (einkaufswert >= 1500) {
        einkaufswert *= 0.98;
      } else {
        System.out.println("Sie haben keinen Rabatt erhalten");
      }
      System.out.println("einkaufswert = " + einkaufswert);
    } else {
      System.out.println("Sie sind kein Stammkunde");
      System.out.println("einkaufswert = " + einkaufswert);
    }
  }
}
