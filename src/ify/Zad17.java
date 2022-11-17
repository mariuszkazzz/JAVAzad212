package ify;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        String r1, r2, r3, r4, r5;
        r1 = "Burgery uJarka";
        r2 = "Pizzeria";
        r3 = "kawiarnia";
        r4 = "wloskie specialay";
        r5 = "szefu";
        char weget, wegan, bezglut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("czy masz u siebie wegeterian? tak t, nie n: ");
        weget  = scanner.next().charAt(0);
        System.out.println("czy masz u siebie wegan tak t, nie n: ");
        wegan  = scanner.next().charAt(0);
        System.out.println("czy masz u siebie bezglutow? tak t, nie n: ");
        bezglut  = scanner.next().charAt(0);


        if (weget == 'n' && wegan == 'n' && bezglut == 'n')
        {
            System.out.println("do wyboru  masz "+ r1);
            System.out.println("do wyboru  masz "+ r3);
            System.out.println("do wyboru  masz "+ r5);
        }
        else if (weget == 't' && wegan == 'n' && bezglut == 't')
        {
            System.out.println("do wyboru  masz "+ r2);
            System.out.println("do wyboru  masz "+ r3);
            System.out.println("do wyboru  masz "+ r5);
        }
        else if (weget == 't' && wegan == 't' && bezglut == 't')
        {
            System.out.println("do wyboru  masz "+ r3);
            System.out.println("do wyboru  masz "+ r5);
        }
        else if (weget == 't' && wegan == 'n' && bezglut == 'n')
        {
            System.out.println("do wyboru  masz "+ r3);
            System.out.println("do wyboru  masz "+ r4);
            System.out.println("do wyboru  masz "+ r5);
        }

    }
}
