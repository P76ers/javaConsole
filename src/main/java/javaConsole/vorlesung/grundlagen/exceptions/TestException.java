package javaConsole.vorlesung.grundlagen.exceptions;

public class TestException extends Exception {
  public void eigeneAusnahme() throws TestException {
    int ergebnis = 1;

    if (ergebnis != 2)
      throw new TestException();
  }

  @Override
  public String getMessage() {
    return "TestException wurde ausgelöst";
  }
}
