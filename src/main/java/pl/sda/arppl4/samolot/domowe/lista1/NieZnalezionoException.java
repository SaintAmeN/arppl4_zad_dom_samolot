package pl.sda.arppl4.samolot.domowe.lista1;

public class NieZnalezionoException extends RuntimeException {
    public NieZnalezionoException(String komunikat) {
        super(komunikat);
    }
}
