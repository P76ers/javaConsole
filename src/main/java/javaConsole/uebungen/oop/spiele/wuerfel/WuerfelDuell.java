package javaConsole.uebungen.oop.spiele.wuerfel;

import java.util.Scanner;

public class WuerfelDuell {
  static Scanner scanner = new Scanner(System.in);

  public static void duell() {
    Spieler spieler = new Spieler("P");
    Spieler computer = new Spieler("Bot");

    int rundenanzahl = 0;

    System.out.println("Rundenanzahl angeben:");
    rundenanzahl = scanner.nextInt();

    for (int i = 1; i <= rundenanzahl; i++) {
      System.out.println("Runde " + i);
      spieler.setAktuellerWurf(spieler.wurf());
      computer.setAktuellerWurf(computer.wurf());

      Spieler.ermittleRundenSieg(spieler, computer);
    }
    Spieler.ermittleGesamtSieg(spieler, computer);
  }
}
