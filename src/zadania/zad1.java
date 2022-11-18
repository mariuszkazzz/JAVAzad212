package zadania;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);


        int suma= 0;
        int a;
        System.out.println("podaj il. liczb");
        a = scaner.nextInt();
        int[] tab = new int[a];
       for (int i = 0; i < a; i++)
        {
            tab[i] =  scaner.nextInt();
            suma += tab[i];
            //3
            // System.out.println(suma);
        }
        System.out.println(suma);





    }

}
