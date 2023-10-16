package lab.tp;

import java.util.Scanner;

public class Bibliotekarz extends Osoba {

    @Override
    public final void dodajksiazke(final Zbior zbior, final Scanner reader) {
        System.out.println("Podaj autor, tytuł i liczbę stron");
        Ksiazka nowa = new Ksiazka(reader.nextLine(),
                reader.nextLine(), Integer.parseInt(reader.nextLine()));
        zbior.dodajksiazke(nowa);
    }

    @Override
    public final void usunksiazke(final Zbior zbior, final Scanner reader) {
        System.out.println("Którą?");
        for (int i = 0; i < zbior.lista.size(); i++) {
            System.out.println(i + " " + zbior.lista.get(i).tytul);
        }
        zbior.usunksiazke(zbior.lista.get(Integer.parseInt(reader.nextLine())));
    }
}
