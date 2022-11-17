package ify;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        double pakietA, pakietB, pakietC, ca, cb, cena;
        Scanner scanner = new Scanner(System.in);
        pakietB = 59.99;
        cb = 0.40;
        pakietC = 69.99;
        pakietA = 39.99;
        ca = 0.45;
        int lminut;

        char znak;
        System.out.println("podaj pakiet A, B, C: ");
        znak  = scanner.next().charAt(0);
        System.out.println("l minut: ");
        lminut = scanner.nextInt();
        if (znak == 'A')
        {
            if (lminut >= 450)
                cena = ((lminut-450)*ca) + pakietA;
            else
                cena = 39.99;

            System.out.println("cena to: " + cena);

        }
        if (znak == 'B')
        {
            if (lminut >= 900)
                cena = ((lminut-900)*cb) + pakietB;
            else
                cena = pakietB;

            System.out.println("cena to: " + cena);

        }
        else
        {
            cena = pakietC;

            System.out.println("cena to: " + cena);
        }

    }
}
