package javaConsole.vorlesung.oop.Vererbung.Sauegetier;

public class Katze extends Saeugetier {
  @Override
  public void geraeuschMachen() {
    // super.geraeuschMachen();
    System.out.println("Miau!");
  }
}
