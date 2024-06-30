package javaConsole.vorlesung.oop.Vererbung.Sauegetier;

public class Eisbaer extends Saeugetier {
  @Override
  public void geraeuschMachen() {
    // super.geraeuschMachen();
    System.out.println("grummel!");
  }
}
