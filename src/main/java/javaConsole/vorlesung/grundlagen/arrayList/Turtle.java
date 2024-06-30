package javaConsole.vorlesung.grundlagen.arrayList;

public class Turtle {
  private String name;
  private String farbe;

  public Turtle(String name, String farbe) {
    this.name = name;
    this.farbe = farbe;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFarbe() {
    return farbe;
  }

  public void setFarbe(String farbe) {
    this.farbe = farbe;
  }
}
