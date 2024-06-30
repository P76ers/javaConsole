package javaConsole.uebungen.oop.arrayList;

public class App {
  public static void main(String[] args) {
    Mitarbeiter[] mitarbeiterListe = {
            new Mitarbeiter("Paul"),
            new Mitarbeiter("Peter"),
            new Mitarbeiter("Patrick"),
            new Mitarbeiter("P"),};

    for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
      System.out.println("mitarbeiter.getName() = " + mitarbeiter.getName());
    }
  }
}
