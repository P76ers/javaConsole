package javaConsole.vorlesung.grundlagen;

public class Selektion {
  public static void main(String[] args) {
    boolean regen = true;

    // einfaches if, in der bedingung wird auf true oder false des Ausdrucks gecheckt
    if (regen == true) {
      System.out.println("Nimm einen Regenschirm mit!");
    }

    // Operatoren Einsatz
    int preis = 3000;
    int konto = 2000;

    if (preis <= konto) {
      System.out.println("GEKAUFT!");
    }

    int nummer = 50;
    char zeichen = 'A';

    if (nummer == 50 && zeichen == 'A') {
      System.out.println("Prüfung ergibt true!");
    }

    // Strings vergleichen
    String nachtwache = "Jon Schnee";

    if (nachtwache.equals("Khal Drogo")) {
      System.out.println("Die Nacht zieht auf und meine Wache beginnt.");
    }

    // IF - ELSE
    int alter = 35;

    if (alter >= 18) {
      System.out.println("Zutritt gewährt!");
    } else {
      System.out.println("Zutritt verweigert!");
    }

    // verschachtele if
    boolean vip = false;

    if (alter >= 18) {

      System.out.println("Zutritt gewährt");

      if (vip == true) {
        System.out.println("Spezielle Angebote!");
      }

    } else {
      System.out.println("Zutritt verweigert!");
    }

    // Else - If
    int akku = 48;

    if (akku < 25) {
      System.out.println("ROT - niedrige Akkuladung");
    } else if (akku < 50) {
      System.out.println("GELB - mittlere Akkuladung");
    } else if (akku < 100) {
      System.out.println("GRÜN - Volle Akkuladung");
    }

    boolean wahrheit = true;
    String name = "";

    if (wahrheit) {
      name = "Aristotiles";
    } else {
      name = "Pinocchio";
    }

    // Ternärer Operator
    // Aufbau -> Bedingung ? Anweisung wenn true : Anweisung wenn false
    name = wahrheit ? "Aristotiles" : "Pinocchio";


    // Switch Case
    char a = '2';
    System.out.println("SWITCH CASE");

    switch (a) {
      case '1':
        System.out.println("a ist 1");
        // break;
      case '2':
        System.out.println("a ist 2");
        // break;
      case '3':
        System.out.println("a ist 3");
        // break;
      default:
        System.out.println("a ist weder 1 oder 2");
        // usw.
    }
  }
}
