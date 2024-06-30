package javaConsole.vorlesung.oop.Vererbung.Character;

public class Krieger extends Character {
  @Override
  public void attacke() {
    System.out.println(this.name + " greift mit Breitschwert an! ");
  }
}
