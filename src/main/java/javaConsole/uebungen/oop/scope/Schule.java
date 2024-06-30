package javaConsole.uebungen.oop.scope;

public class Schule {
  private String name;

  public Schule(String name) {
    this.name = name;
  }

  public void schuelerAusgeben() {
    String[] schuelerArr = {"Willy", "Tilly"};

    for (String schueler : schuelerArr) {
      System.out.println("Schüler = " + schueler);
    }
  }

}
