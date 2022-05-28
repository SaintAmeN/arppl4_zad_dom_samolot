package pl.sda.arppl4.samolot.domowe.samolot_parametr_model;

public class ParametryWeryfikatora {
    private int iloscZnakow;
    private char iloscRzedow;

    public ParametryWeryfikatora(int iloscZnakow, char iloscRzedow) {
        this.iloscZnakow = iloscZnakow;
        this.iloscRzedow = iloscRzedow;
    }

    public int getIloscZnakow() {
        return iloscZnakow;
    }

    public void setIloscZnakow(int iloscZnakow) {
        this.iloscZnakow = iloscZnakow;
    }

    public char getIloscRzedow() {
        return iloscRzedow;
    }

    public void setIloscRzedow(char iloscRzedow) {
        this.iloscRzedow = iloscRzedow;
    }
}
