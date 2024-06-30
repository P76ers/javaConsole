package javaConsole.vorlesung.oop.Vererbung.Abstract;

public class Elefant extends Tier {

  @Override
  public void bewegung() {
    System.out.println(this.name + " stampft");
  }
}
