package javaConsole.uebungen.oop.spiele;

import javaConsole.uebungen.oop.spiele.pokemon.PokemonTurnier;
import javaConsole.uebungen.oop.spiele.wuerfel.WuerfelDuell;
import javaConsole.uebungen.oop.spiele.zahlenraten.Zahlenraten;

import java.util.Scanner;

public class SpieleApp {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    hauptmenu();
  }

  static void hauptmenu() {
    int eingabe = 0;

    System.out.println("*** Bitte Spiel wählen ***");
    System.out.println("[1] - Würfeln");
    System.out.println("[2] - Pokemon");
    System.out.println("[3] - Zahlenraten");
    System.out.println("[4] - beenden");
    eingabe = scanner.nextInt();

    switch (eingabe) {
      case 1:
        WuerfelDuell.duell();
        break;
      case 2:
        eingabe = duellModus();
        if (eingabe == 1) {
          PokemonTurnier.startePvp();
        } else {
          PokemonTurnier.startePve();
        }
        break;
      case 3:
        Zahlenraten.zahlenRaten();
        break;
      default:
        break;
    }
  }

  static int duellModus() {
    System.out.println("Bitte Spielmodus wählen");
    System.out.println("[1]: PVP");
    System.out.println("[2]: PVE");
    return scanner.nextInt();
  }
}
