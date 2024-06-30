package javaConsole.vorlesung.oop.Vererbung.Character;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    menu();
  }

  public static void menu() {
    Scanner scanner = new Scanner(System.in);
    Character player = new Character();
    int eingabe = 0;
    String name = "";

    System.out.println("Character wählen");
    System.out.println("[1] Krieger");
    System.out.println("[2] Schurke");
    System.out.println("[3] Magier");

    eingabe = scanner.nextInt();

    switch (eingabe) {
      case 1:
        player = new Krieger();
        break;
      case 2:
        player = new Schurke();
        break;
      case 3:
        player = new Magier();
        break;
    }

    System.out.println("Bitte Namen eingeben");
    name = scanner.next();

    player.name = name;
    player.attacke();
  }
}
