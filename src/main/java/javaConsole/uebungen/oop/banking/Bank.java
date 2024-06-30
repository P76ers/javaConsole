package javaConsole.uebungen.oop.banking;

import java.util.ArrayList;

public class Bank {
  private String name;

  private ArrayList<Konto> kontoListe = new ArrayList<Konto>();

  public Bank(String name) {
    this.name = name;
  }

  public ArrayList<Konto> getKontoListe() {
    return kontoListe;
  }

  public void setKontoListe(ArrayList<Konto> kontoListe) {
    this.kontoListe = kontoListe;
  }

  public void addKonto(Konto konto) {
    kontoListe.add(konto);
  }

  public void deleteKonto(Konto konto) {
    kontoListe.remove(konto);
  }
}
