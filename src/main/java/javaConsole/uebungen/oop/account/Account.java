package javaConsole.uebungen.oop.account;

public class Account {
  private String name;
  private String email;
  private int alter;

  public Account(String name, String email, int alter) {
    this.name = name;
    this.email = email;
    this.alter = alter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAlter() {
    return alter;
  }

  public void setAlter(int alter) {
    this.alter = alter;
  }

  public void DetailsAusgeben() {
    System.out.println("name = " + name);
    System.out.println("email = " + email);
    System.out.println("alter = " + alter + "\n");
  }
}
