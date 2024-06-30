package javaConsole.uebungen.oop.banking;

public class Konto {
  private String name;
  private int kontoNummer;
  private double guthaben;

  public Konto(String name, int kontoNummer, double guthaben) {
    this.name = name;
    this.kontoNummer = kontoNummer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKontoNummer() {
    return kontoNummer;
  }

  public void setKontoNummer(int kontoNummer) {
    this.kontoNummer = kontoNummer;
  }

  public double getGuthaben() {
    return guthaben;
  }

  public void setGuthaben(double guthaben) {
    this.guthaben = guthaben;
  }
}
