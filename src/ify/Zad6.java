package ify;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("l sekund");
        double secundy = scanner.nextDouble();
        //System.out.println(secundy);


        if (secundy >= 48400)
        {
            secundy = secundy/48400;
            System.out.println("dni: " + secundy);
        }
        else if (secundy >= 3600)
        {
            secundy = secundy/36000;
            System.out.println("godz: " +secundy);
        }
        else if (secundy >= 60)
        {
            secundy = secundy/60;
            System.out.println("min: " +secundy);
        }

    }
}
