package zadania;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("podaj predkoc i ilosc godzin: ");
        double predkosc = 0;
                double suma;
        int ilosc;

        predkosc = scaner.nextByte();
        ilosc = scaner.nextInt();


        for (int i = 0; i <= ilosc; i++)
        {
            suma = predkosc*i;
            //i = i+1;
            System.out.println("trasa po  "+i+"wynosi: " + suma);
        }

    }
}
