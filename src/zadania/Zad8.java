package zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("ile lat: ");
        int ilelat= scaner.nextInt();
        int suma =0;
        int sumaOP =0;
        int miescioc = 0;
        int srednia = 0;

        for(int i = 0; i < ilelat; i++)
        {
                for (int j = 1; j <= 12; j++) {

                    System.out.println("podaj opady w [cm] " + j);
                    miescioc = scaner.nextInt();
                    suma += miescioc;
                    srednia = suma/(ilelat*12);
                    //sumaOP +=

                }
                //System.out.println("rok_" + i);

        }
        System.out.println("liczba mieciecy " + (ilelat*12));
        System.out.println("suma w [cm]: "+ suma );
        System.out.println("srednia miescieczna w [cm]: "+ srednia );
    }
}
