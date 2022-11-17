package ify;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        double cz1, cz2, cz3, cz4, wynik;
        cz1 = 0.1;
        cz2 = 0.08;
        cz3 = 0.06;
        cz4 = 0.04;
        Scanner scanner = new Scanner(System.in);
        int lczekow;
        System.out.println("podaj ilosc czekow: ");
        lczekow = scanner.nextInt();
        if (lczekow <= 20)
        {
            wynik = 10 + (lczekow*cz1);
            System.out.println("cena: " + wynik);
        }
        else if (lczekow <= 20 && lczekow >=39)
        {
            wynik = 10 + lczekow*cz2;
            System.out.println("cena: " + wynik);
        }
        else if (lczekow <= 40 && lczekow >=59)
        {
            wynik = 10 + lczekow*cz3;
            System.out.println("cena: " + wynik);
        }
        else
        {
            wynik = 10 + lczekow*cz4;
            System.out.println("cena: " + wynik);
        }

    }
}
