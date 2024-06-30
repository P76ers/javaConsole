package javaConsole.vorlesung.grundlagen;

public class Scope {
  // Instanzvariablen:
  // Gültig in der gesamten Klasse

  private String bezeichnung;

  // Parameter Variablen
  public Scope(String bezeichnung) {
    /*
    Die Variablen werden als Parameter in Methoden und Constructor
    innerhalb der runden Klammern im Methoden -Kopf deklariert.
            Sie können nur in der entsprechenden Methode oder dem Constructor
    verwendet werden.
    */
  }

  public void MeineMethode() {
    // lokale Variable
    double zeit = 15.00;
    /*
    Werden innerhalb eines Methoden -Körpers deklariert.Sie können von der Zeile
    ihrer Deklaration bis zum Ende der Methode verwendet werden.
    */

    if (true) {
      int erg = 0; // ausnahme innerhalb einer kontrollstruktur ist es für sich lokal und gültig
    }


    // Block Variablen oder Schleifen-Variablen

    for (int i = 0; i < 5; i++) {
      // die Block ist nur innerhalb der Schleife gültig, außer sie haben sie vorher
      // deklariert
    }

    int[] zahlen = {1, 2, 3};

    for (int zahl : zahlen) {
      // gleiches für schleifen vars wie zb mit foreach
    }
  }
}
