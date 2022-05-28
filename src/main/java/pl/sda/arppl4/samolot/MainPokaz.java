package pl.sda.arppl4.samolot;

public class MainPokaz {
    public static void main(String[] args) {
        KlasaA obiekt = new KlasaA();
        obiekt.imie = "pawel";

//        1 bajt = 8 bitów
//        int - zajmuje 32 bitów 4 bajtów
//
//        Tablica ma adres początkowy w pamięci => adres 0
//        0 element => w adresie 0
//        1 element => w adresie 0 + 1 * (rozmiar danych => 4) = 4
//        2 element => w adresie 0 + 2 * (rozmiar danych => 4) = 8
//        3 element => w adresie 0 + 3 * (rozmiar danych => 4) = 12
//        4 element => w adresie 0 + 3 * (rozmiar danych => 4) = 16

//        Tablica ma adres początkowy w pamięci => adres 100
//        0 element => w adresie 100
//        1 element => w adresie 100 + 1 * (rozmiar danych => 4) = 104
//        2 element => w adresie 100 + 2 * (rozmiar danych => 4) = 108
//        3 element => w adresie 100 + 3 * (rozmiar danych => 4) = 112
//        4 element => w adresie 100 + 3 * (rozmiar danych => 4) = 116
        int[] tablica = {1, 2, 3};
        tablica[2] = 5;
        tablica = new int[2];

    }
}
