package javaConsole.uebungen.oop.methoden;

public class Buch {
  private String author;
  private String titel;
  private String bewertung;

  private static int ausgeliehen;

  enum Bewertung {
    SUPER,
    GUT,
    OK,
    MIES
  }

  public Buch(String author, String titel) {
    this.author = author;
    this.titel = titel;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitel() {
    return titel;
  }

  public String getBewertung() {
    return bewertung;
  }

  public void bewertung(int zahl) {
    if (zahl == 1) {
      this.bewertung = Bewertung.SUPER.toString();
    } else if (zahl == 2) {
      this.bewertung = Bewertung.GUT.toString();
    } else if (zahl == 3) {
      this.bewertung = Bewertung.OK.toString();
    } else {
      this.bewertung = Bewertung.MIES.toString();
    }
  }

  public void buchInfo() {
    System.out.print("Author: " + getAuthor() + " | ");
    System.out.print("Titel: " + getTitel() + " | ");
    System.out.print("Bewertung: " + getBewertung());

  }

  public void ausleihen(Buch buch) {
    ausgeliehen++;
  }

  public void ausleihen(Buch buch, int zahl) {
    ausgeliehen = zahl;
  }
}
