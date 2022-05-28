package pl.sda.arppl4.samolot.domowe.samolot_parametr_model;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        boolean wynik = sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(slowo, new ParametryWeryfikatora(4, 'F'));
        if(wynik) {
            System.out.println("Wprowadzone dane (wejście) są poprawne");
        }else{
            System.out.println("Wprowadzone dane (wejście) są niepoprawne");
        }
    }

    private static boolean sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(String slowo, ParametryWeryfikatora parametry) {
        if (slowo.length() > 1 && slowo.length() <= parametry.getIloscZnakow()) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= parametry.getIloscRzedow()) {
                System.out.println("Litera jest ok!");

                String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                try {
                    int liczba = Integer.parseInt(wszystkoPozaPierwszymZnakiem);
                    System.out.println("Wszystko poza pierwszym znakiem jest cyfrą!");

                    return true; // nie został rzucony wyjątek, wszystkie if'y zostały spełnione
                } catch (NumberFormatException nfe) {
                    System.out.println("Wszystko poza pierwszym znakiem nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
        return false;
    }
}