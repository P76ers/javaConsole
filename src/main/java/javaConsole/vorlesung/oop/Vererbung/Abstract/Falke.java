package javaConsole.vorlesung.oop.Vererbung.Abstract;

public class Falke extends Tier {

  @Override
  public void bewegung() {
    System.out.println(this.name + " fliegt");
  }
}
