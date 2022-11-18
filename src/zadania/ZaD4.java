package zadania;

import java.util.Scanner;

public class ZaD4 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        double grosz = 0.01;
        int idni;
        int x;

        System.out.println("podaj ilosc dni: ");
        idni = scaner.nextInt();

        for (int i = 0; i <= idni; i++)
        {
            grosz = grosz*2;
            x = (int)grosz;
            x += grosz;


            System.out.println("po : " +i+ "dniach ma "+x);

        }

    }
}
