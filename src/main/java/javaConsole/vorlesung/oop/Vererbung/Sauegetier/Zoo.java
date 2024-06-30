package javaConsole.vorlesung.oop.Vererbung.Sauegetier;

public class Zoo {
  public static void main(String[] args) {
    Hund bello = new Hund();
    Katze miez = new Katze();
    Eisbaer pelz = new Eisbaer();

    bello.groesse = 150;
    bello.alter = 5;

    bello.geraeuschMachen();
    miez.geraeuschMachen();
    pelz.geraeuschMachen();
  }
}
