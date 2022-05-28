package pl.sda.arppl4.samolot.domowe.lista1;

public class Main {
    public static void main(String[] args) {
        ListaZadanDoZrealizowania zadaniaDomowe = new ListaZadanDoZrealizowania();

        Zadanie zadanieDoDodania1 = new Zadanie("pączki1", "zrobić pączki");
        Zadanie zadanieDoDodania2 = new Zadanie("pączki2", "zrobić pączki");
        Zadanie zadanieDoDodania3 = new Zadanie("pączki3", "zrobić pączki");
        Zadanie zadanieDoDodania4 = new Zadanie("pączki4", "zrobić pączki");

        zadaniaDomowe.dodajZadanie(zadanieDoDodania1);
        zadaniaDomowe.dodajZadanie(zadanieDoDodania2);
        zadaniaDomowe.dodajZadanie(zadanieDoDodania3);
        zadaniaDomowe.dodajZadanie(zadanieDoDodania4);

        zadaniaDomowe.usunZadanie("pączki1");


    }
}
