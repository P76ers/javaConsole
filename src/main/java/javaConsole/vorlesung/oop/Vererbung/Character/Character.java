package javaConsole.vorlesung.oop.Vererbung.Character;

public class Character {
  protected String name;
  protected int lebenspunkte;

  public Character() {
  }

  public Character(String name, int lebenspunkte) {
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
  }

  public void attacke() {
    System.out.println(this.name + " greift an! ");
  }
}
