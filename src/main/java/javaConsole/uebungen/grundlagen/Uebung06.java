package javaConsole.uebungen.grundlagen;

public class Uebung06 {
  public static void main(String[] args) {
    // 1
    int i = 1;

    for (; i <= 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    i = 1;

    while (i < 11) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    i = 1;

    do {
      System.out.print(i + " ");
      i++;
    } while (i < 11);
    System.out.println();

    // 2
    String[] cars = {"Audi", "VW", "Ferrari", "Lamborghini", "Mazda"};
    for (String car : cars) {
      System.out.print(car + " ");
    }
    System.out.println();

    // 3
    int summe = 0;
    int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int zahl : zahlen) {
      summe += zahl;
    }
    System.out.println("summe = " + summe);

    // ***
    summe = 0;
    for (i = 0; i < 10; i++) {
      summe += zahlen[i];
    }
    System.out.println("summe = " + summe);

    // 4
    String text1 = "abc";
    String text2 = "xyz";

    i = 1;
    while (i < 10) {
      System.out.print(text1 + " ");
      i++;
    }
    System.out.println();

    i = 1;
    do {
      System.out.print(text2 + " ");
      i++;
    } while (i < 10);
    System.out.println();

    i = 1;
    for (; i < 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    // 5
    for (i = 1; i <= 10; i++) {
      System.out.println(i + " * " + i + " = " + i * i);
    }
  }
}
