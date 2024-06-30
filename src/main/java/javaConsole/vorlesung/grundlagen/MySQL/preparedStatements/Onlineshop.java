package javaConsole.vorlesung.grundlagen.MySQL.preparedStatements;

public class Onlineshop {
  public static void main(String[] args) {
    // DbProdukte.connect();
    // DbProdukte.selectAll();

    Produkt newProduct = new Produkt(
            666,
            "Schokolade",
            9.99,
            "jummy",
            5
    );

    // DbProdukte.insertInto(newProduct);

    Produkt updateProduct = new Produkt(
            6,
            666,
            "Schokolade",
            19.99,
            "jummy",
            5
    );

    // DbProdukte.update(updateProduct);

    // Produkt deleteProduct = new Produkt(6);
    // DbProdukte.delete(deleteProduct);
    // DbProdukte.selectAll();
    // DbProdukte.routineLesen();

    DbProdukte.selectAll();
  }
}
