package pl.sda.arppl4.samolot.domowe.samolot;

import java.util.Scanner;

public class Main1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String litera = scanner.next();

        if (litera.equals("A") || litera.equals("B") || litera.equals("C") || litera.equals("D")) {
            System.out.println("Litera jest ok!");
        }else{
            System.out.println("Litera nie jest ok!");
        }
    }
}
