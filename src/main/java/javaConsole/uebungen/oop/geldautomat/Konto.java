package javaConsole.uebungen.oop.geldautomat;

public class Konto {
  private double guthaben;

  public Konto() {
  }

  public Konto(double guthaben) {
    this.guthaben = guthaben;
  }

  public double getGuthaben() {
    return guthaben;
  }

  public void setGuthaben(double guthaben) {
    this.guthaben = guthaben;
  }
}
