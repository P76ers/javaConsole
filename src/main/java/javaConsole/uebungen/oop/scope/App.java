package javaConsole.uebungen.oop.scope;

public class App {
  public static void main(String[] args) {
    Schule mySchool = new Schule("Albert-Schweitzer-Gymnasium");

    mySchool.schuelerAusgeben();
  }
}
