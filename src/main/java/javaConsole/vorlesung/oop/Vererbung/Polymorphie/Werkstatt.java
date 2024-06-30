package javaConsole.vorlesung.oop.Vererbung.Polymorphie;

public class Werkstatt {
  public static void main(String[] args) {
    Auto car = new Cabrio();
    Cabrio cabrio = new Cabrio();
    Limousine limo = new Limousine();

    Auto[] fuhrpark = new Auto[]{car, limo, cabrio};

    for (Auto auto : fuhrpark) {
      reparieren(auto);
      if (auto instanceof Cabrio) {
        Cabrio cabrio1 = (Cabrio) auto;
        cabrio1.verdeckOeffnen();
      }
    }
  }

  public static void reparieren(Auto auto) {
    auto.reparieren();
  }
}
