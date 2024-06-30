package javaConsole.uebungen.oop.spiele.pokemon;

import java.util.Random;

public class Pokemon {
  private String name;
  private int lebenspunkte;
  private int damage;
  Random random = new Random();

  public Pokemon() {
  }

  public Pokemon(String name, int lebenspunkte) {
    this.name = name;
    this.lebenspunkte = lebenspunkte;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public void setLebenspunkte(int lebenspunkte) {
    this.lebenspunkte = lebenspunkte;
    if (lebenspunkte < 0) {
      this.lebenspunkte = 0;
    }
  }

  public void standardAttacke(Pokemon pokemon) {
    damage = random.nextInt(6) + 10 - random.nextInt(12) + 1;
    pokemon.setLebenspunkte(pokemon.lebenspunkte - damage);
    System.out.println(this.getName() + " verursacht " + damage + " Schaden an " + pokemon.getName());
    System.out.println("Lebenspunkte " + this.getName() + " = " + this.getLebenspunkte());
    System.out.println("Lebenspunkte " + pokemon.getName() + " = " + pokemon.getLebenspunkte() + "\n");
  }

  public void superAttacke(Pokemon pokemon) {
    damage = random.nextInt(6) + 20 - random.nextInt(15) + 1;
    pokemon.setLebenspunkte(pokemon.lebenspunkte - damage);
    System.out.println(this.getName() + " verursacht " + damage + " Schaden an " + pokemon.getName());
    System.out.println("Lebenspunkte " + this.getName() + " = " + this.getLebenspunkte());
    System.out.println("Lebenspunkte " + pokemon.getName() + " = " + pokemon.getLebenspunkte() + "\n");
  }

  public static void checkWin(Pokemon p1, Pokemon p2) {
    if (p1.lebenspunkte <= 0) {
      System.out.println(p2.getName() + " wins!");
    } else {
      System.out.println(p1.getName() + " wins!");
    }
  }
}
