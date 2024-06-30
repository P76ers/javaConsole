package javaConsole.uebungen.oop.taschenrechner;

public class Taschenrechner {
  public static double zahl1;
  public static double zahl2;

  public static double addieren(double zahl1, double zahl2) {
    return zahl1 + zahl2;
  }

  public static double subtrahieren(double zahl1, double zahl2) {
    return zahl1 - zahl2;
  }

  public static double multiplizieren(double zahl1, double zahl2) {
    return zahl1 * zahl2;
  }

  public static double dividieren(double zahl1, double zahl2) {
    if (zahl2 != 0) {
      return zahl1 / zahl2;
    } else {
      System.out.println("Division durch 0 ist nicht erlaubt.");
      return 0;
    }
  }

  public static double modulo(double zahl1, double zahl2) {
    return zahl1 % zahl2;
  }
}
