package javaConsole.vorlesung.oop.auto;

public class Auto {
  // Attribute / Instanzvariablen
  private String autotyp;
  private String farbe;
  private int motorleistung;
  private int geschwindigkeit;

  // Default Constructor - Standard Konstruktor
  public Auto() {
    autotyp = "Nix";
    farbe = "Neutral";
    motorleistung = 0;
    geschwindigkeit = 0;
  }

  public Auto(int autotyp) {
  }

  // Parametersierter Konstruktor
  public Auto(String autotyp) {
    this.autotyp = autotyp;
  }

  public Auto(String autotyp, String farbe) {
    this.autotyp = autotyp;
    this.farbe = farbe;
  }

  public Auto(String autotyp, String farbe, int motorleistung) {
    this.autotyp = autotyp;
    this.farbe = farbe;
    this.motorleistung = motorleistung;
  }

  public Auto(String autotyp, String farbe, int motorleistung, int geschwindigkeit) {
    this.autotyp = autotyp;
    this.farbe = farbe;
    this.motorleistung = motorleistung;
    this.geschwindigkeit = geschwindigkeit;
  }

  // Getter / Setter
  public void setAutotyp(String autotyp) {
    this.autotyp = autotyp;
  }

  public String getAutotyp() {
    return autotyp;
  }

  // Methoden
  public void beschleunigen() {
    System.out.println("Ich beschleunige...");
    motoraufdrehen(30);
  }

  private double quadratzahl() {
    return 5 * 5;
  }

  private void motoraufdrehen(int geschwindigkeit) {
    this.geschwindigkeit += geschwindigkeit;
  }

  public void beschleunigen(int umwieviel) {
    geschwindigkeit += umwieviel;
  }

  public void bremsen() {
    System.out.println("Ich beschleunige...");
    geschwindigkeit -= 30;
  }

  public void gibDetails() {
    System.out.println("Autotyp:" + autotyp);
    System.out.println("Farbe:" + farbe);
    System.out.println("Motorleistung:" + motorleistung);
    System.out.println("Geschwindigkeit:" + geschwindigkeit);
  }
}
