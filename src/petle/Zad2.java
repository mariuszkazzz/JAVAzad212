package petle;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        char slowa;
        boolean twierdzenie =true;
        int i= 0;
        //System.out.println("dopuki dzila to warunek jest spelniomy: znak t,T,n,N");
        while (i<= 10)
        {
            System.out.println("wpisz tak albo nie");
            slowa = scanner.next().charAt(0);
            if(slowa=='t'|slowa=='n') {
                twierdzenie = true;
            }else {
                twierdzenie = false;

            }

            System.out.println("Podałeś "+ slowa);

            i++;

        }









    }
}
