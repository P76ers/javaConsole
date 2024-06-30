package javaConsole.vorlesung.oop.tennis;

public class Tennisspieler {

  private String name;
  private int itn; // 10 -1 (beste)
  private int spiele;
  private int siege;
  private int niederlagen;

  public Tennisspieler(String name, int itn) {
    this.name = name;
    this.itn = itn;
  }

  public double getSiegesQuote() {
    double quote = 0;
    if (spiele != 0) {
      quote = (double) siege / spiele * 100;
    }
    return quote;
  }

  public void erhoeheSiegeUm1() {
    siege++;
  }

  public void erhoeheSpieleUm1() {
    spiele++;
  }

  public void erhoeheNiederlageUm1() {
    niederlagen++;
  }

  @Override
  public String toString() {

    return "Name:" + name +
            " \tItn:" + itn +
            " \tSpiele:" + spiele +
            " \tSiege:" + siege +
            " \tNiederlagen:" + niederlagen +
            " \tSiegesquote:" + getSiegesQuote() + "%";
  }

  // region Getter - Setter

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getItn() {
    return itn;
  }

  public void setItn(int itn) {
    this.itn = itn;
  }

  public int getSpiele() {
    return spiele;
  }

  public void setSpiele(int spiele) {
    this.spiele = spiele;
  }

  public int getSiege() {
    return siege;
  }

  public void setSiege(int siege) {
    this.siege = siege;
  }

  public int getNiederlagen() {
    return niederlagen;
  }

  public void setNiederlagen(int niederlagen) {
    this.niederlagen = niederlagen;
  }

  // endregion


}

