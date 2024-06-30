package javaConsole.vorlesung.oop.Vererbung.Interfaces;

public class Cyberdog extends Dog implements IMaschine {
  @Override
  public void ladeBatterie() {
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
