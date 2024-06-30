package javaConsole.vorlesung.oop.Vererbung.Polymorphie;

public class Cabrio extends Auto {

  @Override
  public void reparieren() {
    System.out.println("Cabrio wird repariert");
  }

  public void verdeckOeffnen() {
    System.out.println("Verdeck wird geöffnet");
  }
}
