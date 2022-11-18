package zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        int liczba_pokoi = 0;
        int liczba_zaj_pokoi = 0;
        //int liczba_pus_pokoi = 0;
        int lpieter;
        int a = 0;
        int suma_ogolna= 0;
        double oblozenie = 0;
        int suma_zaj = 0;

        Scanner scaner = new Scanner(System.in);
        System.out.println("ile pieter: ");
        lpieter = scaner.nextInt();
        for (int i = 0; i <=lpieter; i++)
        {
            System.out.println("pietro "+i+" ile pokoi : ");
            liczba_pokoi = scaner.nextInt();
            System.out.println("pietro "+i+" ile zaj pokoi : ");
            liczba_zaj_pokoi = scaner.nextInt();
            suma_ogolna += liczba_pokoi;
            suma_zaj +=liczba_zaj_pokoi;
            if (i==lpieter)
            {
                oblozenie = (double)suma_zaj/(double)suma_ogolna;
                System.out.println("wszystkir: "+ suma_ogolna);
                System.out.println("zajete: "+ suma_zaj);
                System.out.println("oblezenie: "+ oblozenie);
            }

        }


        }

}
