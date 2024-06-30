package javaConsole.vorlesung.grundlagen;

public class Arrays {
  public static void main(String[] args) {
    // Datentyp [] arrayNamen = new Datentyp[Gesamtgröße];
    int[] lottozahlen = new int[6];

    // Zuweisung und Zugriff über den arrayNamen[index]
    lottozahlen[0] = 2;
    lottozahlen[1] = 7;
    lottozahlen[2] = 11;
    lottozahlen[3] = 10;
    lottozahlen[4] = 30;
    lottozahlen[5] = 42;

    // lottozahlen[6] = 2; //versuch auf einen ungültigen index zuzugreifen erzeugt eine IndexOutOfRange Exception

    int[] lottozahlen2 = {2, 7, 11, 10, 30, 42, 66, 88};

    int ergebnis = lottozahlen[0] + lottozahlen[5];  // 44

    String[] filmklassiker = {"Terminator", "Pulp Fiction", "Casablanca", "Der Pate", "2001", "Schindlers Liste"};

        /* Bad Practice
        System.out.println(filmklassiker[0]);
        System.out.println(filmklassiker[1]);
        System.out.println(filmklassiker[2]);
        System.out.println(filmklassiker[3]);
        System.out.println(filmklassiker[4]);
        System.out.println(filmklassiker[5]);
        */

    for (int i = 0; i < filmklassiker.length; i++) {
      System.out.println(filmklassiker[i]);
    }

    // Multidimensionele Arrays
    int[][] array = new int[4][5];

    array[2][1] = 100;

    for (int a = 0; a < 4; a++) {
      for (int b = 0; b < 5; b++) {
        System.out.println(a + " | " + b);
      }
    }
  }
}
