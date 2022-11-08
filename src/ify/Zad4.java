package ify;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        int ocena1, ocena2, ocena3;
        Scanner scanner = new Scanner(System.in);

            System.out.println("podaj wyniki w %: ");
            ocena1 = scanner.nextInt();
            ocena2 = scanner.nextInt();
            ocena3 = scanner.nextInt();

       double srednia = (ocena2 + ocena1 + ocena3) / 3;
        System.out.println("srednia: " + srednia);


        if (srednia > 90) {
            System.out.println("5");
        }
        else if (srednia > 80 && srednia < 89) {
            System.out.println("4");
        }
        else if (srednia > 70 && srednia < 79) {
            System.out.println("3");
        }
        else if (srednia > 60 && srednia < 69) {
            System.out.println("4");
        }
        else if(srednia < 60) {
            System.out.println("1");
        }
    }
    //int [] wyniki = new int [3];
}
