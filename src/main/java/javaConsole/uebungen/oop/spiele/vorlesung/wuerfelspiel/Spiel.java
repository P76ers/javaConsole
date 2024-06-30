package javaConsole.uebungen.oop.spiele.vorlesung.wuerfelspiel;

public class Spiel {
  int anzahlSpiele = 0;
  int unentschieden = 0;

  private Spieler spieler;
  private Spieler gegner;

  public Spiel(int anzahlSpiele) {
    spieler = new Spieler();
    gegner = new Spieler();
    this.anzahlSpiele = anzahlSpiele;
    unentschieden = 0;
    spielen();
    zeigeErgebnis(spieler.getGewonnen(), gegner.getGewonnen());
  }

  public void spielen() {
    for (int i = 1; i <= anzahlSpiele; i++) {

      spieler.wuerfeln();
      gegner.wuerfeln();

      System.out.println("Runde: " + i);
      System.out.println("Spieler hat gewürfel: " + spieler.getAktuellerWurf());
      System.out.println("Gegner hat gewürfel: " + gegner.getAktuellerWurf());

      if (spieler.getAktuellerWurf() > gegner.getAktuellerWurf()) {
        spieler.setGewonnen();
      } else if (spieler.getAktuellerWurf() < gegner.getAktuellerWurf()) {
        gegner.setGewonnen();
      } else {
        unentschieden++;
      }
    }
  }

  public void zeigeErgebnis(int spielerGewonnen, int gegnerGewonnen) {
    if (spielerGewonnen > gegnerGewonnen) {
      System.out.println("Spieler hat gewonnen");
    } else if (spielerGewonnen < gegnerGewonnen) {
      System.out.println("Gegner hat gewonnen");
    } else {
      System.out.println("UNENTSCHIEDEN!!!");
    }
  }
}
