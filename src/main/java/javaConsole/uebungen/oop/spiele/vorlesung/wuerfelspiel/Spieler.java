package javaConsole.uebungen.oop.spiele.vorlesung.wuerfelspiel;

import java.util.Random;

public class Spieler {
  private String name;
  private int gewonnen = 0;
  private int aktuellerWurf;

  public Spieler() {
  }

  public Spieler(String name) {
    this.name = name;
    this.gewonnen = 0;
  }

  public int getGewonnen() {
    return gewonnen;
  }

  public void setGewonnen() {
    this.gewonnen++;
  }

  public int getAktuellerWurf() {
    return aktuellerWurf;
  }

  public void wuerfeln() {
    Random random = new Random();
    this.aktuellerWurf = random.nextInt(6) + 1;
  }
}
