package javaConsole.vorlesung.oop.auto;

public class App {
  public static void main(String[] args) {
    Auto porsche = new Auto("Panamera", "Pink", 550, 0);
    Auto vw = new Auto("Mazda", "weiss");

    // Verwendung Setters & Getter für instanzvariable
    vw.setAutotyp("Mercedes");
    System.out.println(vw.getAutotyp());

    Auto[] autos = new Auto[2];
    autos[0] = porsche;
    autos[1] = new Auto("VW", "orange", 550, 0);

    Auto[] autos1 = {
            new Auto("Lamborghini", "schwarz", 550, 0),
            new Auto("Ferrari", "rot", 550, 0),
            new Auto("Bughatti", "grün", 550, 0)
    };

    porsche.beschleunigen();
  }
}
