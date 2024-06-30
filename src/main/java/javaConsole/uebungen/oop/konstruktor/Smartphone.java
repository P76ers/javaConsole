package javaConsole.uebungen.oop.konstruktor;

public class Smartphone {
  private String hersteller;
  private String modell;
  private int speicher;

  public Smartphone() {
  }

  public Smartphone(String hersteller) {
    this.hersteller = hersteller;
  }

  public Smartphone(String hersteller, String modell) {
    this(hersteller);
    this.modell = modell;
  }

  public Smartphone(String hersteller, String modell, int speicher) {
    this(hersteller, modell);
    this.speicher = speicher;
  }
}
