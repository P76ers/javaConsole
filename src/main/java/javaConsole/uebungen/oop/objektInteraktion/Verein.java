package javaConsole.uebungen.oop.objektInteraktion;

import java.util.ArrayList;

public class Verein {
  public static void main(String[] args) {
    ArrayList<Mitglied> mitgliederListe = new ArrayList<Mitglied>();

    Mitglied mitglied1 = new Mitglied("One", 1991);
    Mitglied mitglied2 = new Mitglied("Two", 1992);
    Mitglied mitglied3 = new Mitglied("Three", 1993);
    Mitglied mitglied4 = new Mitglied("Four", 1993);
    Mitglied mitglied5 = new Mitglied("Five", 1994);
    Mitglied mitglied6 = new Mitglied("Six", 1994);
    Mitglied mitglied7 = new Mitglied("Seven", 1995);
    Mitglied mitglied8 = new Mitglied("Eight", 1995);
    Mitglied mitglied9 = new Mitglied("Nine", 1996);
    Mitglied mitglied10 = new Mitglied("Teeny", 1999);

    mitgliederListe.add(mitglied1);
    mitgliederListe.add(mitglied2);
    mitgliederListe.add(mitglied3);
    mitgliederListe.add(mitglied4);
    mitgliederListe.add(mitglied5);
    mitgliederListe.add(mitglied6);
    mitgliederListe.add(mitglied7);
    mitgliederListe.add(mitglied8);
    mitgliederListe.add(mitglied9);
    mitgliederListe.add(mitglied10);

    mitgliederDetails(1991, mitgliederListe);
  }

  static void mitgliederDetails(int jahr, ArrayList<Mitglied> mitgliederListe) {
    System.out.println("Mitgliederauflistung seit: " + jahr);
    for (Mitglied mitglied : mitgliederListe) {
      if (mitglied.getBeitrittsjahr() >= jahr)
        System.out.println(mitglied.getName());
    }
  }
}
