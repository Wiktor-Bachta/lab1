package lab.tp;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner reader = new Scanner(System.in);
        Osoba osoba = new Osoba();
        Zbior stan = new Zbior();
        while (true) {
            System.out.println("Kim jesteś? k - klient, "
                    + "b - bibliotekarz, x - wyjdź");
            String odpowiedz = reader.nextLine();
            if ("k".equals(odpowiedz)) {
                osoba = new Klient();
            } else if ("b".equals(odpowiedz)) {
                osoba = new Bibliotekarz();
            } else {
                break;
            }
            while (true) {
                System.out.println(
                        "Co chcesz zrobić? w - wypożyczyć, d - dodać książkę, "
                                + "u - usunąć, z - zobaczyc ksiazki x - wyjść");
                odpowiedz = reader.nextLine();
                if ("w".equals(odpowiedz)) {
                    System.out.println("Którą?");
                    for (int i = 0; i < stan.lista.size(); i++) {
                        System.out.println(i + " " + stan.lista.get(i).tytul);
                    }
                    osoba.wypozycz(stan.lista.get(Integer.parseInt(reader.nextLine())));
                } else if ("u".equals(odpowiedz)) {
                    osoba.usunksiazke(stan, reader);
                } else if ("d".equals(odpowiedz)) {
                    osoba.dodajksiazke(stan, reader);
                } else if ("z".equals(odpowiedz)) {
                    stan.pokaz();
                } else {
                    break;
                }
            }
        }
        reader.close();
    }

    public static int kwadrat(final int a) {
        return a * a;
    }
}
