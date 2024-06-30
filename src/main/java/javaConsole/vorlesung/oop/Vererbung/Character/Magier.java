package javaConsole.vorlesung.oop.Vererbung.Character;

public class Magier extends Character {
  @Override
  public void attacke() {
    System.out.println(this.name + " greift mit Zauberstab an! ");
  }
}
