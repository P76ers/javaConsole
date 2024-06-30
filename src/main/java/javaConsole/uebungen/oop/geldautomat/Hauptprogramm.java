package javaConsole.uebungen.oop.geldautomat;

import java.util.Scanner;

public class Hauptprogramm {
  public static void main(String[] args) {
    menu();
  }

  static void menu() {
    Geldautomat automat = new Geldautomat();
    Scanner scanner = new Scanner(System.in);
    int eingabe = 0;

    System.out.println("Menu");
    System.out.println("[1] - Kontostand anzeigen");
    System.out.println("[2] - Geld abheben");

    eingabe = scanner.nextInt();

    switch (eingabe) {
      case 1:
        automat.kontostand();
        break;
      case 2:
        automat.abheben();
        break;
      default:
        System.out.println("Falsche Eingabe!");
        break;
    }
    menu();
  }
}
