package lab.tp;

public class Ksiazka {

  String autor;
  String tytul;
  Boolean wypozyczona = false;
  int strony;

  public Ksiazka(final String autor, final String tytul, final int strony) {
    this.autor = autor;
    this.tytul = tytul;
    this.strony = strony;
  }

  public final void wypozycz() {
    wypozyczona = !wypozyczona;
  }

  public final void pokaz() {
    if (wypozyczona) {
      System.out.println("autor: " + autor + " tytuł: "
          + tytul + " strony: " + strony + " wypożyczona: tak");
    } else {
      System.out.println("autor: " + autor + " tytuł: "
          + tytul + " strony: " + strony + " wypożyczona: nie");
    }
  }
}
