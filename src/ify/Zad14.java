package ify;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        double pakietA, pakietB, pakietC, ca, cb, cenaA,cenaB,cenaC;
        Scanner scanner = new Scanner(System.in);
        pakietB = 59.99;
        cb = 0.40;
        pakietC = 69.99;
        pakietA = 39.99;
        ca = 0.45;
        int lminut;

        char znak;
        System.out.println("podaj pakiet A, B, C: ");
        znak  = scanner.next().charAt(0);
        System.out.println("l minut: ");
        lminut = scanner.nextInt();
        if (znak == 'A')
        {
            if (lminut >= 450)
            {
                cenaA = ((lminut - 450) * ca) + pakietA;

                if (cenaA >= 40 )
                {
                    double cebula1, cebula2;
                    cebula1 = cenaA - pakietB - ((lminut-900)*cb);
                    cebula2 = cenaA - pakietC;
                    System.out.println("zaoszczedzil bys na B Złociszów: " + cebula1 + " zaoszczedzil bys na C Złociszów: " + cebula2);

                }
            }
            else {
                cenaA = 39.99;

            }

            System.out.println("cena to: " + cenaA);



        }
        else if (znak == 'B')
        {
            if (lminut >= 900) {
                cenaB = ((lminut - 900) * cb) + pakietB;
                if (cenaB >= 60 )
                {
                    double cebula1, cebula2;
                    cebula1 = cenaB - pakietA - ((lminut-450)*ca);
                    cebula2 = cenaB - pakietC;
                    System.out.println("zaoszczedzil bys na A Złociszów: " + cebula1 + " zaoszczedzil bys na C Złociszów: " + cebula2);

                }
            }
            else {
                cenaB = pakietB;


            }
            System.out.println("cena to: " + cenaB);

        }
        else
        {
            cenaC = pakietC;

            System.out.println("cena to: " + cenaC);

            if (cenaC >= 90 )
            {
                double cebula1, cebula2;
                cebula1 = cenaC - pakietA - ((lminut-450)*ca);
                cebula2 = cenaC - pakietB - ((lminut-900)*cb);
                System.out.println("zaoszczedzil bys na A Złociszów: " + cebula1 + " zaoszczedzil bys na B Złociszów: " + cebula2);

            }
        }






    }
    void funkcja()
    {

    }
}
