package javaConsole.uebungen.oop.banking;

public class App {
  public static void main(String[] args) {
    Konto konto1 = new Konto("Peter", 12345, 1390.20);
    Konto konto2 = new Konto("Paul", 23456, 418.56);
    Konto konto3 = new Konto("Richard", 34567, 560.61);
    Konto konto4 = new Konto("Johnson", 45678, 4356.21);

    Bank bank = new Bank("Badbank");

    bank.addKonto(konto1);
    bank.addKonto(konto2);
    bank.addKonto(konto3);
    bank.addKonto(konto4);

    bank.deleteKonto(konto1);

    for (Konto konto : bank.getKontoListe()) {
      System.out.println(konto.getName() + " - " + konto.getKontoNummer());
    }
  }
}
