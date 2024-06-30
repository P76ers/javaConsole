package javaConsole.uebungen.oop.hund;

public class Hund {
  public String name;
  public String rasse;
  public int alter;

  public Hund(String name, String rasse) {
    this.alter = 0;
    this.name = name;
    this.rasse = rasse;
  }

  public void wauMachen() {
    System.out.println(this.name + "wowt!");
  }

  public void alterErhoehen() {
    this.alter++;
  }

  public void detailsAusgeben() {
    System.out.println("name = " + name);
    System.out.println("rasse = " + rasse);
    System.out.println("alter = " + alter);
  }
}
