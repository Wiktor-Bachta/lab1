package lab.tp;

import java.util.Scanner;

public class Osoba {
  public final void wypozycz(final Ksiazka ksiazka) {
    ksiazka.wypozycz();
  }

  public void dodajksiazke(final Zbior zbior, final Scanner reader) {
    System.out.println("nie masz uprawnień");
  }

  public void usunksiazke(final Zbior zbior, final Scanner reader) {
    System.out.println("nie masz uprawnień");
  }
}
