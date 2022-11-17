package petle;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n, x;

        System.out.println("podaj il liczb");
        x = scanner.nextInt();
        for (int j = 0; j <= x; j++)
        {
            for (int i = 0; i <= x; i++)
            {
                System.out.println("podaj liczbe");
                n = scanner.nextInt();



                if (n >= 10 && n <= 24)
                    System.out.println("ta liczba jest z tego przedzialu");
                else
                    System.out.println("ta liczba nie jest z tego przedzialu");


            }
        }
    }
}
