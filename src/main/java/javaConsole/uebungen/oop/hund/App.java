package javaConsole.uebungen.oop.hund;

public class App {
  public static void main(String[] args) {
    // 1
    Hund hund1 = new Hund("Bello", "Bernhardiner");
    hund1.alterErhoehen();
    hund1.detailsAusgeben();

    // 2
    Hund hund2 = new Hund("Bella", "Dalmatiner");
    Hund hund3 = new Hund("Wuffi", "Dackel");
    Hund hund4 = new Hund("Doggy", "Collie");

    Hund[] hunde = {hund1, hund2, hund2, hund3};


    for (Hund hund : hunde) {
      hund.alter = 7;
      hund.detailsAusgeben();
    }
  }
}
