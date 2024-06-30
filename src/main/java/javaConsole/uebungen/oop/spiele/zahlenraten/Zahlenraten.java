package javaConsole.uebungen.oop.spiele.zahlenraten;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {

  public static void zahlenRaten() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int zahl = random.nextInt(100) + 1;
    int eingabe = 0;

    for (int i = 10; i >= 1; i--) {
      System.out.println("Sie haben " + i + " Versuche");
      System.out.println("Bitte Zahl erraten (1-100)");

      eingabe = scanner.nextInt();

      while (eingabe < 1 || eingabe >= 100) {
        System.out.println("Falsche Eingabe!\nZahl muss zwischen 1-100 liegen!");
        eingabe = scanner.nextInt();
      }

      if (eingabe == zahl) {
        System.out.println("Richtig erraten!");
        break;
      } else if (eingabe < zahl) {
        System.out.println("Geratene Zahl ist zu klein!\n");
      } else if (eingabe > zahl) {
        System.out.println("Geratene Zahl ist zu groß!\n");
      }
    }
  }

}
