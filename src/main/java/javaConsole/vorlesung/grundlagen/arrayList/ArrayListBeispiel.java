package javaConsole.vorlesung.grundlagen.arrayList;


import java.util.ArrayList;

public class ArrayListBeispiel {
  public static void main(String[] args) {
    // Eine ArrayList erstellen

    ArrayList<Turtle> turtles = new java.util.ArrayList<>();

    Turtle leonardo = new Turtle("Leonardo", "blau");
    Turtle michelangelo = new Turtle("Michelangelo", "gelb");
    Turtle raphael = new Turtle("Raphael", "rot");
    Turtle donatello = new Turtle("Donatello", "lila");

    // Hinzufügen in die Liste
    turtles.add(leonardo);
    turtles.add(michelangelo);
    turtles.add(raphael);
    turtles.add(donatello);

    // Größe einer liste ausgeben
    System.out.println(turtles.size());

    // Zugriff auf ein Element
    Turtle t = turtles.get(2);

    // Löschen von Elementen
    turtles.remove(leonardo);
    turtles.remove(2);

    for (Turtle tu : turtles) {
      tu.setFarbe("Pink");
    }

    // Lambda
    turtles.forEach(turtle -> {
      turtle.setFarbe("Grün");
      turtle.getName();
    });
  }
}
