package ify;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        int woda, stal, powetrze;
        Scanner scanner = new Scanner(System.in);

        powetrze = 343;
        woda = 1490;
        stal = 5100;
        char znak;
        Double dystans, wynik, czas;
        System.out.println("podaj dystans: ");
        dystans = scanner.nextDouble();
        //czysci bufor
        scanner.nextLine();
        System.out.println("podaj stal = s, powierze = p albo woda = w: ");
        znak  = scanner.next().charAt(0);


        if (znak == 's')
        {
            czas = dystans/stal;
            System.out.println("czas w stali: " + czas);
        }
        else if (znak == 'w')
        {
            czas = dystans/woda;
            System.out.println("czas w wodzie: " + czas);
        }
        else if (znak == 'p')
        {
            czas = dystans/powetrze;
            System.out.println("czas w powietrzu: " + czas);
        }

    }

}
