package ify;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double waga;
                int odleglosc;
        System.out.println("podaj wage i odleglosc: ");
        waga = scanner.nextInt();
        odleglosc = scanner.nextInt();

        double stawka;

        if(waga >= 5)
        {
            stawka = 3.80 *  ((odleglosc/500) + 1);
            System.out.println("cena: " + stawka);
        }
        else if (waga >=3 && waga < 5 )
        {
            stawka = 3.70* ((odleglosc/500) + 1);
            System.out.println("cena: " + stawka);
        }
        else if (waga >=1 && waga < 3 )
        {
            stawka = 2.20 *((odleglosc/500) + 1);
            System.out.println("cena: " + stawka);
        }
        else if (waga <=1)
        {
            stawka = 1.10*((odleglosc/500) + 1);
            System.out.println("cena: " + stawka);
        }

    }
}
