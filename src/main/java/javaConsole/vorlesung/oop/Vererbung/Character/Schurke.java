package javaConsole.vorlesung.oop.Vererbung.Character;

public class Schurke extends Character{
  @Override
  public void attacke() {
    System.out.println(this.name + " greift mit Brotmesser an! ");
  }
}
