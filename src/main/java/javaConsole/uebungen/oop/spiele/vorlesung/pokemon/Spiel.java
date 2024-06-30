package javaConsole.uebungen.oop.spiele.vorlesung.pokemon;

import java.util.Random;
import java.util.Scanner;

public class Spiel {
  Pokemon spieler = new Pokemon("Gamer", 100, 10, 100);

  Pokemon[] gegnerListe = {
          new Pokemon("Glumanda", 100, 10, 45),
          new Pokemon("Relaxo", 80, 5, 60),
          new Pokemon("Lohrengelrak", 150, 20, 20),
          new Pokemon("LeonardoDeKapador", 75, 15, 30),
          new Pokemon("MikeTyson", 500, 100, 4100)
  };

  Pokemon aktuellerGegner;

  boolean gameOver = false;

  Scanner scanner = new Scanner(System.in);


  public Spiel() {

    Random random = new Random();
    int rndGegner = random.nextInt(gegnerListe.length);

    aktuellerGegner = gegnerListe[rndGegner];
    spielen();
  }

  public void spielen() {

    do {
      zeigeEingabe();
      duell();
    } while (!gameOver);
  }

  public void zeigeEingabe() {
    int auswahl;

    while (true) {
      System.out.println("Bitte wähle eine Attacke:");
      System.out.println("1 - Standard");
      System.out.println("2 - Super");

      while (!scanner.hasNextInt()) {
        String input = scanner.next();
        System.out.printf("\"%s\" ist keine korrekte Auswahl.%n", input);
      }

      auswahl = scanner.nextInt();

      if (auswahl == 1) {
        spieler.standardAttacke();
        break;
      } else if (auswahl == 2) {
        spieler.superAttacke();
        break;
      } else {
        System.out.println("Bitte eine korrekte Attacke auswählen (1 oder 2)");
        continue;
      }
    }
  }

  public void duell() {
    aktuellerGegner.kriegeSchaden(spieler.getAktuellerSchaden());
    System.out.println("Spieler 1 hat mit " + spieler.getAktuellerSchaden() + " angegriffen!");
    System.out.println(aktuellerGegner.getName() + " hat nun Lebenspunkte:" + aktuellerGegner.getLebenspunkte());

    System.out.println(" --- ");

    Random random = new Random();
    int auswahlGegner = random.nextInt(2) + 1;


    if (auswahlGegner == 1) {
      spieler.kriegeSchaden(aktuellerGegner.standardAttacke());
    } else if (auswahlGegner == 2) {
      spieler.kriegeSchaden(aktuellerGegner.superAttacke());
    }

    System.out.println(aktuellerGegner.getName() + " hat mit " + aktuellerGegner.getAktuellerSchaden() + " angegriffen!");
    System.out.println("Spieler hat nun Lebenspunkte:" + spieler.getLebenspunkte());

    if (spieler.getLebenspunkte() <= 0) {
      zeigeResultate();
    } else if (aktuellerGegner.getLebenspunkte() <= 0) {
      zeigeResultate();
    }
  }

  public void zeigeResultate() {
    gameOver = true;

    System.out.println("Spieler Lebenspunkte: " + spieler.getLebenspunkte());
    System.out.println("Gegner Lebenspunkte: " + aktuellerGegner.getLebenspunkte());

    if (spieler.getLebenspunkte() > aktuellerGegner.getLebenspunkte()) {
      System.out.println("Spieler gewinnt");
    } else if (spieler.getLebenspunkte() < aktuellerGegner.getLebenspunkte()) {
      System.out.println("Gegner gewinnt");
    }
  }
}
