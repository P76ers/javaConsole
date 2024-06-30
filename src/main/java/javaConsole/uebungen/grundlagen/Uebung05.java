package javaConsole.uebungen.grundlagen;

public class Uebung05 {
  public static void main(String[] args) {
    double[] meinArray = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 11.0};
    for (double mein : meinArray) {
      System.out.println(mein);
    }

    String[] zoo = {
            "Stampfi", "Hund", "Katze", "Maus", "Aalbert",
            "Wal", "Delphin", "Nilpferd", "Löwe", "Nashorn"
    };

    for (String tier : zoo) {
      System.out.println(tier);
    }
  }
}
