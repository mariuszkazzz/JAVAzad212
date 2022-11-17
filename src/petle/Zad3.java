package petle;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean twierdzenie =true;
        int i = 0;
        String slowa;
        while (i <= 10)
        {
            System.out.println("wpisz tak albo nie");
            slowa = scaner.nextLine();
            if(slowa=="tak"||slowa=="nie") {
                twierdzenie = true;
            }else {
                twierdzenie = false;

            }

            System.out.println("Podałeś "+ slowa);

            i++;

        }
    }
}
