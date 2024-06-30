package javaConsole.vorlesung.grundlagen.MySQL.preparedStatements;

import java.sql.*;

public class DbProdukte {
  // Drivermanager -> Connection erstellen
  // Connection -> Statement erstellen
  // Statement -> liefert Array: ResultSet

  static String url = "jdbc:mysql://localhost:3306/onlineshop";
  // String url = "jdbc:mysql://127.0.0.1:3306/onlineshop";
  static String user = "root";
  static String password = "";

  static Connection connection;

  public static void connect() {
    try {
      connection = DriverManager.getConnection(url, user, password);
      System.out.println("Verbindung aufgebaut!");
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public static void closeConnection() {
    try {
      connection.close();
      System.out.println("Verbindung beendet");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static void selectAll() {
    connect();
    try {
      String sql = "SELECT * FROM produkte;";
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        System.out.println(
                "Artikelnummer: " + resultSet.getString("Artikelnummer") + "\t\t" +
                        "Name: " + resultSet.getString("Name") + "\t\t\t" +
                        "Preis: " + resultSet.getString("Preis") + "\t\t" +
                        "Beschreibung: " + resultSet.getString("Beschreibung") + "\t" +
                        "Anzahl: " + resultSet.getString("Anzahl") + "\t"
        );
      }
    } catch (SQLException e) {
      System.out.println(e);
    } finally {
      closeConnection();
    }
  }

  public static void insertInto(Produkt produkt) {
    connect();
    try {
      // Prepared Statement
      String sql =
              "INSERT INTO produkte(artikelnummer,name,preis,beschreibung,anzahl) " +
                      "VALUES(?,?,?,?,?);";

      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, produkt.getArtikelnummer());
      preparedStatement.setString(2, produkt.getName());
      preparedStatement.setDouble(3, produkt.getPreis());
      preparedStatement.setString(4, produkt.getBeschreibung());
      preparedStatement.setInt(5, produkt.getAnzahl());

      preparedStatement.execute();

    } catch (SQLException e) {
      System.out.println(e);
    } finally {
      closeConnection();
    }
  }

  public static void update(Produkt produkt) {
    connect();
    try {
      String sql =
              "UPDATE produkte SET artikelnummer=? ,name=?, preis=?, beschreibung=?, anzahl=? " +
                      "WHERE id=?;";

      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, produkt.getArtikelnummer());
      preparedStatement.setString(2, produkt.getName());
      preparedStatement.setDouble(3, produkt.getPreis());
      preparedStatement.setString(4, produkt.getBeschreibung());
      preparedStatement.setInt(5, produkt.getAnzahl());
      preparedStatement.setInt(6, produkt.getId());

      preparedStatement.execute();

    } catch (SQLException e) {
      System.out.println(e);
    } finally {
      closeConnection();
    }
  }

  public static void delete(Produkt produkt) {
    connect();
    try {
      String sql =
              "DELETE FROM produkte WHERE id=?;";

      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, produkt.getId());

      preparedStatement.execute();

    } catch (SQLException e) {
      System.out.println(e);
    } finally {
      closeConnection();
    }
  }

}
