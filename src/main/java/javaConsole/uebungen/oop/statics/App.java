package javaConsole.uebungen.oop.statics;

public class App {
  public static void main(String[] args) {
    Gegner bloody = new Gegner("Bloodlord");
    Gegner fire = new Gegner("Firelord");

    System.out.println("Anzahl der Gegner: " + Gegner.anzahl);
  }
}
