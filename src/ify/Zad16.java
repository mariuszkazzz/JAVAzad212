package ify;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        double a, b, c, d, e;
        a = 0;
        b = 5;
        c = 15;;
        d = 30;
        e = 60;
        int lczekow, wynik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc ksizasek: ");
        lczekow = scanner.nextInt();
        if (lczekow == 0)
        {
            wynik = 0;
            System.out.println("points: " + wynik);
        }
        else if (lczekow ==1)
        {
            wynik = 5;
            System.out.println("points: " + wynik);
        }
        else if (lczekow ==2)
        {
            wynik = 15;
            System.out.println("points: " + wynik);
        }
        else if (lczekow ==3)
        {
            wynik = 30;
            System.out.println("points: " + wynik);
        }
        else if (lczekow <=4)
        {
            wynik = 60;
            System.out.println("points: " + wynik);
        }
    }
}
