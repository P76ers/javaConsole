package javaConsole.uebungen.oop.spiele.vorlesung.pokemon;

import java.util.Random;

public class Pokemon {
  private String name;
  private int lebenspunkte;
  private int aktuellerSchaden;
  private int standardAttackMax;
  private int superAttackMax;

  public Pokemon(String name, int lebenspunkte, int standardAttackMax, int superAttackMax) {
    this.name = name;
    this.lebenspunkte = lebenspunkte;
    this.standardAttackMax = standardAttackMax;
    this.superAttackMax = superAttackMax;
  }

  public int standardAttacke() {
    Random random = new Random();
    aktuellerSchaden = random.nextInt(standardAttackMax) + 1;
    return aktuellerSchaden;
  }

  public int superAttacke() {
    Random random = new Random();
    aktuellerSchaden = random.nextInt(superAttackMax) + 1;
    return aktuellerSchaden;
  }

  public void kriegeSchaden(int wert) {
    this.lebenspunkte -= wert;

    if (lebenspunkte <= 0)
      lebenspunkte = 0;
  }

  public int getAktuellerSchaden() {
    return aktuellerSchaden;
  }

  public String getName() {
    return name;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }
}
