package zadania;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int ilosc;
        double przyrsot;
        int ldni;
        double wynik = 0;
        double wynikall = 0;
        int x = 0;


        System.out.println("l dni: ");
        ldni = scaner.nextInt();
        System.out.println("sredni przyrst [%]: ");
        przyrsot = scaner.nextDouble();
        System.out.println("ile org: ");
        ilosc = scaner.nextInt();
        ldni = ldni -1;


        for (int i = 0; i <= ldni; i++)
        {
            //if
            System.out.println("dzien : " + (i+1));
            wynik = ((double)ilosc*przyrsot)*i+ilosc;
            System.out.println("populacja wynosi: " + wynik);
            wynikall += wynik;

        }


        while(x != ldni)
        {
            if (ilosc <= 1 && przyrsot <= 50){
                System.out.println("dzien : " + (x+1));
                wynik = ((double)ilosc*przyrsot)*x+ilosc;
                System.out.println("populacja wynosi: " + wynik);
                wynikall += wynik;
            }
            x++;

        }

        System.out.println("po "+(ldni+1)+" dnaich populacja wynosi: " + wynikall);






    }
}
