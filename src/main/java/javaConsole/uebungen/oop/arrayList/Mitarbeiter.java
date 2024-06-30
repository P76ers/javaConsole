package javaConsole.uebungen.oop.arrayList;

public class Mitarbeiter {
  private String name;

  public Mitarbeiter(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void detailsAusgeben() {
    System.out.println("name = " + name);
  }
}
