package javaConsole.vorlesung.grundlagen;

public class Operatoren {

  public static void main(String[] args) {
    // Arithmetische Operatoren
    int a = 5; // = Zuweisungsoperator
    int b = 2;
    int c = a % b; // modulo -> c=1

    int zahl = 3;
    zahl = zahl + 5;  // 8
    zahl += 5;

    int addition = 4;
    int subtraktion = 10;
    int multiplikation = 2;
    int division = 21;
    int modulo = 13;

    // Kombierte Operatoren
    addition += 5;
    subtraktion -= 8;
    multiplikation *= 7;
    division /= 7;
    modulo %= 10; // Rest: 3

    // Pre und Post Inkrement und Dekrement
    int zahl2 = 0;

    System.out.println(zahl2);   // 0
    System.out.println(zahl2++); // 0 - erst printen, dann erhöhen
    System.out.println(zahl2);   // 1
    System.out.println(++zahl2); // 2 - erst erhöhen, dann printen

    // Vergleichsoperatoren - geben immer true oder false zurück
    int x = 5, y = 10, z = 5;

    System.out.println(x > z);  // false
    System.out.println(x < y);  // true
    System.out.println(x >= z); // true
    System.out.println(x <= y); // true
    System.out.println(x == y); // false
    System.out.println(x != y); // true

    // Logische Operatoren
    boolean b1 = true, b2 = false, b3 = true, b4 = false;

    // UND - Operator
    System.out.println(b1 & b3); // true
    System.out.println(b1 & b2); // false

    // ODER
    System.out.println(b1 | b2); // true
    System.out.println(b2 | b4); // false

    // EXCLUSIVE - ODER - XOR
    System.out.println(b1 ^ b3); // true
    System.out.println(b1 ^ b3); // false

    int x1 = 0;
    boolean e = (x1 >= 0) || (++x1 <= 1); // true
    System.out.println(e);

    // logische NOT
    boolean wahrheit = true;
    boolean luegner = !wahrheit;

    // togglen
    boolean lichtAn = false;
    lichtAn = !lichtAn;
  }
}
