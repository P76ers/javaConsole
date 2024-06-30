package javaConsole.vorlesung.oop.Vererbung.Sauegetier;

public class Hund extends Saeugetier {

  @Override
  public void geraeuschMachen() {
    // super.geraeuschMachen();
    System.out.println("Wuff!");
  }
}
