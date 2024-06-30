package javaConsole.uebungen.oop.objektInteraktion;

public class Mitglied {
  private String name;
  private int beitrittsjahr;

  public Mitglied(String name, int beitrittsjahr) {
    this.name = name;
    this.beitrittsjahr = beitrittsjahr;
  }

  public String getName() {
    return name;
  }

  public int getBeitrittsjahr() {
    return beitrittsjahr;
  }
}
