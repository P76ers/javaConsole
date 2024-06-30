package javaConsole.vorlesung.oop.Vererbung.Interfaces;


import java.util.ArrayList;

public class Werkstatt {
  public static void main(String[] args) {
    ArrayList<IMaschine> maschinen = new ArrayList<>();

    maschinen.add(new Cyborg());
    maschinen.add(new Cyberdog());

    for (IMaschine maschine : maschinen) {
      maschine.ladeBatterie();
    }

  }
}
