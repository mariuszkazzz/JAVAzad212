package ify;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczby kalorii i tluszczu: ");
        double tluszcz, kalorie, kalZTluszcz, procentKalZTluszczu;
        kalorie = scanner.nextDouble();
        tluszcz = scanner.nextDouble();
        kalZTluszcz = tluszcz*9;
        procentKalZTluszczu = kalZTluszcz/kalorie;
        System.out.println("kal z tluszczu: " + kalZTluszcz);
        System.out.println("% kal z tluszczu: "+ procentKalZTluszczu);

        if(procentKalZTluszczu < 30)
            System.out.println("produkt niskotluszczowy");






    }
}
