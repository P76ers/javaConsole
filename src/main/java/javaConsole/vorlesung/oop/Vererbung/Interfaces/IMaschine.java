package javaConsole.vorlesung.oop.Vererbung.Interfaces;

public interface IMaschine {
  // public static final double maximaleEnergie = 100;
  double maximaleEnergie = 100;

  void ladeBatterie();

  int getAkkustand();

  boolean funktionsTuechtig();

}
