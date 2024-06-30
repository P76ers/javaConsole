package javaConsole.uebungen.oop.statics;

public class Gegner {
  public String name;
  public static int anzahl;

  public Gegner() {
  }

  public Gegner(String name) {
    this.name = name;
    anzahl++;
  }
}
