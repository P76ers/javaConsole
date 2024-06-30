package javaConsole.uebungen.oop.taschenrechner;

import java.util.Scanner;

public class Hauptprogramm {
  static Scanner scanner = new Scanner(System.in);
  static double zahl1, zahl2;
  static String operator;

  public static void main(String[] args) {
    menu();

    // System.out.println("zahl1 = " + zahl1);
    // System.out.println("zahl2 = " + zahl2);
    // System.out.println("operator = " + operator);

  }

  static void menu() {
    System.out.println("Taschenrechner");
    eingabeZahl1();
    eingabeRechenoperator();
    eingabeZahl2();

    switch (operator) {
      case "+":
        System.out.println(zahl1 + " + " + zahl2 + " = " + Taschenrechner.addieren(zahl1, zahl2));
        break;
      case "-":
        System.out.println(zahl1 + " - " + zahl2 + " = " + Taschenrechner.subtrahieren(zahl1, zahl2));
        break;
      case "*":
        System.out.println(zahl1 + " * " + zahl2 + " = " + Taschenrechner.multiplizieren(zahl1, zahl2));
        break;
      case "/":
        System.out.println(zahl1 + " / " + zahl2 + " = " + Taschenrechner.dividieren(zahl1, zahl2));
        break;
      case "%":
        System.out.println(zahl1 + " % " + zahl2 + " = " + Taschenrechner.modulo(zahl1, zahl2));
        break;
    }
    System.out.println();
    menu();
  }

  static void eingabeZahl1() {
    try {
      System.out.println("Zahl1 eingeben:");
      zahl1 = scanner.nextDouble();
    } catch (Exception e) {
      System.out.println("Eingabe muss eine gültige Zahl sein");
    }
  }

  static void eingabeZahl2() {
    try {
      System.out.println("Zahl2 eingeben:");
      zahl2 = scanner.nextDouble();
    } catch (Exception e) {
      System.out.println("Eingabe muss eine gültige Zahl sein");
      eingabeZahl2();
    }
  }

  static void eingabeRechenoperator() {
    try {
      System.out.println("Rechenoperator eingeben (+ - * / %):");
      operator = scanner.next();
      if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") &&
              !operator.equals("%")) {
        eingabeRechenoperator();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
