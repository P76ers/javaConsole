package javaConsole.uebungen.oop.spiele.wuerfel;

import java.util.Random;

public class Spieler {
  private String name;
  private int rundenSieg;
  private int aktuellerWurf;

  public Spieler(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRundenSieg() {
    return rundenSieg;
  }

  public void setRundenSieg(int rundenSieg) {
    this.rundenSieg = rundenSieg;
  }

  public int getAktuellerWurf() {
    return aktuellerWurf;
  }

  public void setAktuellerWurf(int aktuellerWurf) {
    this.aktuellerWurf = aktuellerWurf;
  }

  public int wurf() {
    int wurf;
    Random random = new Random();
    wurf = random.nextInt(6) + 1;
    System.out.println(this.name + " würfelt eine " + wurf);
    return wurf;
  }

  public void rundenSieg() {
    this.rundenSieg++;
  }

  public static void ermittleRundenSieg(Spieler s1, Spieler s2) {
    if (s1.aktuellerWurf > s2.aktuellerWurf) {
      System.out.println("Ein Punkt für " + s1.name + "\n");
      s1.rundenSieg();
    } else if (s2.aktuellerWurf > s1.aktuellerWurf) {
      System.out.println("Ein Punkt für " + s2.name + "\n");
      s2.rundenSieg();
    }
  }

  public static void ermittleGesamtSieg(Spieler s1, Spieler s2) {
    if (s1.rundenSieg > s2.rundenSieg) {
      System.out.println(s1.name + " wins" + s1.rundenSieg + ":" + s2.rundenSieg);
    } else if (s1.rundenSieg < s2.rundenSieg) {
      System.out.println(s2.name + " wins mit " + s2.rundenSieg + ":" + s1.rundenSieg);
    } else {
      System.out.println("Unentschieden");
    }
  }
}
