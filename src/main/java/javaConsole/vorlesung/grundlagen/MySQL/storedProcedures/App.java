package javaConsole.vorlesung.grundlagen.MySQL.storedProcedures;

public class App {
  public static void main(String[] args) {

    Produkt newProdukt = new Produkt(
            666,
            "Schokolade",
            9.99,
            "jummy",
            5
    );


    Produkt deleteProduct = new Produkt(
            9
    );

    Produkt updateProduct = new Produkt(
            2,
            222,
            "Ravi",
            2.22,
            "oli",
            2
    );

    // DbProdukte.routineInsertInto(newProduct);
    // DbProdukte.routineLesen();

    // DbProdukte.routineDelete(deleteProduct);
    // DbProdukte.routineLesen();

    DbProdukte.routineUpdate(updateProduct);
    DbProdukte.routineLesen();
  }
}
