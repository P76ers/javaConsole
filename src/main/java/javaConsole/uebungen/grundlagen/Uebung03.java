package javaConsole.uebungen.grundlagen;

public class Uebung03 {
  public static void main(String[] args) {
    int x = 8;

    // 1
    System.out.println("x = " + x);
    System.out.println("x + 2 = " + (x + 2));
    System.out.println("x - 4 = " + (x - 4));
    System.out.println("x * 5 = " + x * 5);
    System.out.println("x / 2 = " + x / 2);

    // 2
    x = 20;
    System.out.println("x = " + x);
    System.out.println("x + 2 = " + (x += 2));
    System.out.println("x - 4 = " + (x -= 4));
    System.out.println("x * 5 = " + (x *= 5));
    System.out.println("x / 2 = " + (x /= 2));

    rechnen(1, 3, '+');
    rechnen(1, 3, '-');
    rechnen(1, 3, '*');
    rechnen(3, 3, '/');

  }

  static void rechnen(int x, int y, char oper) {
    int erg = 0;
    switch (oper) {
      case '+':
        erg = x + y;
        break;
      case '-':
        erg = x - y;
        break;
      case '*':
        erg = x * y;
        break;
      case '/':
        erg = x / y;
        break;
    }
    System.out.println(x + " " + oper + " " + y + " = " + erg);
  }
}
