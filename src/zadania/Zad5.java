package zadania;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //String napis;
        String litera;
        System.out.println("podaj napis: ");
        String napis = scaner.nextLine();
        System.out.println("podaj wybrana litere: ");
        litera = scaner.nextLine();
        char inicial;
        int ile = 0;
        char lit = litera.charAt(0);
        System.out.println(napis);
        int ilosc = napis.length();
        for (int i = 0; i < ilosc; i++)
        {
            inicial = napis.charAt(i);
            if (inicial==lit)
            {
                ile=ile+1;
            }

            //System.out.println(lit + " jest: " + c);
        }
        System.out.println(lit + " jest: " + ile);




    }
}
