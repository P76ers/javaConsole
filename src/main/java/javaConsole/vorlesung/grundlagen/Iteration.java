package javaConsole.vorlesung.grundlagen;

public class Iteration {
  public static void main(String[] args) {
    // Kopfgesteuerte Schleifen

    // for Schleife
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // endlos Schleife
    // for (int i = 0; i < 1; i--) {
    //   System.out.println("Ich bin ein durchlauf.");
    // }

    // while
    int nummer = 6;

    while (nummer != 6) {
      nummer = (int) ((Math.random() * 6) + 1);
      System.out.println(nummer + " ");
    }

    // fussgesteuerte Schleifen

    // do while wird mindestens 1x ausgeführt
    do {
      nummer = (int) ((Math.random() * 6) + 1);
      System.out.println(nummer + " ");
    } while (nummer != 6);


    // for each
    String[] familien = {"Lannister", "Stark", "Targaryen", "Bolton", "Tyrell"};

    for (String familie : familien) {
      System.out.println(familie);

      if (familie.equals("Lannister")) {
        System.out.println("Bezahlt immer seine Schulden");
      }
    }

    // continue
    for (int i = 0; i < 5; i++) {

      if (i == 3)
        continue;
      System.out.println(i + " ");
    }

    // break
    for (int i = 0; i < 5; i++) {

      if (i == 3)
        break;
      System.out.println(i + " ");
    }
  }
}
