package javaConsole.uebungen.grundlagen;

import java.util.Scanner;

public class Uebung042 {
  public static void main(String[] args) {
    modulo();
  }

  static void modulo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte Zahl1 eingeben:");
    int x = scanner.nextInt();
    System.out.println("Bitte Operator eingeben:");
    String operator = scanner.next();
    System.out.println("Bitte Zahl2 eingeben:");
    int y = scanner.nextInt();

    switch (operator) {
      case "+":
        System.out.println(x + y);
        break;
      case "-":
        System.out.println(x - y);
        break;
      case "*":
        System.out.println(x * y);
        break;
      case "/":
        if (y != 0) {
          System.out.println(x / y);
        } else {
          System.out.println("Teilen durch 0 nicht erlaubt!");
        }
        break;
      case "%":
        System.out.println(x % y);
        break;
    }
  }
}
