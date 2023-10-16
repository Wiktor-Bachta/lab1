package lab.tp;

import java.util.ArrayList;

public class Zbior {

  ArrayList<Ksiazka> lista = new ArrayList<Ksiazka>();

  public Zbior() {
    lista.add(new Ksiazka("Mickiewicz", "Pan Tadeusz", 500));
    lista.add(new Ksiazka("Sienkiewicz", "Potop", 200));
    lista.add(new Ksiazka("Słowacki", "Balladyna", 50));
    lista.add(new Ksiazka("Nałkowska", "Granica", 70));
  }

  public final void dodajksiazke(final Ksiazka ksiazka) {
    lista.add(ksiazka);
  }

  public final void usunksiazke(final Ksiazka ksiazka) {
    lista.remove(ksiazka);
  }

  public final void pokaz() {
    for (Ksiazka ksiazka : lista) {
      ksiazka.pokaz();
    }
  }
}
