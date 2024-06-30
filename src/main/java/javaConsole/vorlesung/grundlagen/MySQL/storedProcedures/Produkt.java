package javaConsole.vorlesung.grundlagen.MySQL.storedProcedures;

public class Produkt {
  private int id;
  private int artikelnummer;
  private String name;
  private double preis;

  private String beschreibung;
  private int anzahl;

  public Produkt(int id) {
    this.id = id;
  }

  public Produkt(int id, int artikelnummer, String name, double preis, String beschreibung, int anzahl) {
    this.id = id;
    this.artikelnummer = artikelnummer;
    this.name = name;
    this.preis = preis;
    this.beschreibung = beschreibung;
    this.anzahl = anzahl;
  }

  public Produkt(int artikelnummer, String name, double preis, String beschreibung, int anzahl) {
    this.artikelnummer = artikelnummer;
    this.name = name;
    this.preis = preis;
    this.beschreibung = beschreibung;
    this.anzahl = anzahl;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getArtikelnummer() {
    return artikelnummer;
  }

  public void setArtikelnummer(int artikelnummer) {
    this.artikelnummer = artikelnummer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public int getAnzahl() {
    return anzahl;
  }

  public void setAnzahl(int anzahl) {
    this.anzahl = anzahl;
  }
}
