package javaConsole.vorlesung.oop.tennis;

public class Tennisturnier {
  private Tennisspieler s1, s2, s3;

  public Tennisturnier() {
    s1 = new Tennisspieler("Andrew", 10);
    s2 = new Tennisspieler("Becker", 5);
    s3 = new Tennisspieler("Agassi", 7);

    duellStarten(s1, s2);
    duellStarten(s2, s3);
    duellStarten(s3, s1);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }

  public void duellStarten(Tennisspieler spieler1, Tennisspieler spieler2) {
    spieler1.erhoeheSpieleUm1();
    spieler2.erhoeheSpieleUm1();

    if (spieler1.getItn() > spieler2.getItn()) {
      spieler1.erhoeheSiegeUm1();
      spieler2.erhoeheNiederlageUm1();
    } else if (spieler1.getItn() < spieler2.getItn()) {
      spieler1.erhoeheNiederlageUm1();
      spieler2.erhoeheSiegeUm1();
    } else {
    }
  }
}
