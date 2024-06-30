package javaConsole.vorlesung.oop.Vererbung.Abstract;

public class Fisch extends Tier {

  @Override
  public void bewegung() {
    System.out.println(this.name + " schwimmt");
  }
}
