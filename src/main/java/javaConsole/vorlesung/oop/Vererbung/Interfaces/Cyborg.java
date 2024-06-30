package javaConsole.vorlesung.oop.Vererbung.Interfaces;

public class Cyborg extends Mensch implements IMaschine {
  @Override
  public void ladeBatterie() {
    System.out.println("wird geladen");
  }

  @Override
  public int getAkkustand() {
    return 0;
  }

  @Override
  public boolean funktionsTuechtig() {
    return false;
  }
}
