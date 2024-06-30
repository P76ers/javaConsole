package javaConsole.uebungen.oop.spiele.pokemon;

import java.util.Random;
import java.util.Scanner;

public class PokemonTurnier {
  static Scanner scanner = new Scanner(System.in);
  static Random random = new Random();

  public static void startePvp() {
    int eingabe = 0;
    int activePlayer = 1;
    int passivePlayer = 0;
    boolean toggle = true;

    Pokemon[] gamers = {
            new Pokemon("P", 100),
            new Pokemon("S", 100)};

    while (gamers[0].getLebenspunkte() > 0 && gamers[1].getLebenspunkte() > 0) {
      activePlayer = toggle ? 1 : 0;
      passivePlayer = toggle ? 0 : 1;

      eingabe = attackenWahl(gamers[activePlayer]);

      if (eingabe == 1) {
        gamers[activePlayer].standardAttacke(gamers[passivePlayer]);
      } else if (eingabe == 2) {
        gamers[activePlayer].superAttacke(gamers[passivePlayer]);
      }

      toggle = !toggle;
    }
    Pokemon.checkWin(gamers[activePlayer], gamers[passivePlayer]);
  }

  public static void startePve() {
    int eingabe = 0;

    Pokemon spieler = new Pokemon("P", 100);
    Pokemon computer = new Pokemon("Bot", 100);


    while (spieler.getLebenspunkte() > 0 && computer.getLebenspunkte() > 0) {

      eingabe = attackenWahl(spieler);

      if (eingabe == 1) {
        spieler.standardAttacke(computer);
      } else if (eingabe == 2) {
        spieler.superAttacke(computer);
      }

      eingabe = random.nextInt(2) + 1;
      System.out.println("computerzahl = " + eingabe);
      if (eingabe == 1) {
        computer.standardAttacke(spieler);
      } else if (eingabe == 2) {
        computer.superAttacke(spieler);
      }
    }
    Pokemon.checkWin(spieler, computer);
  }

  static int attackenWahl(Pokemon gamer) {
    System.out.println("Bitte Attacke wählen ➡️" + gamer.getName());
    System.out.println("[1]: Standardattacke");
    System.out.println("[2]: Superattacke");
    return scanner.nextInt();
  }

}
