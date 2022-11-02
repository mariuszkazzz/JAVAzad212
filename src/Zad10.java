import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        Scanner wpisywanie = new Scanner(System.in);

        System.out.println("podaj cene: ");
        double cena = wpisywanie.nextDouble();
        System.out.println(cena + "zł");


        double podatek1, podatek2, zceny1, zceny2;
        podatek2 = 0.04;
        podatek1 = 0.02;
        zceny1 = (podatek1 * cena) + cena;
        zceny2 = (podatek2 * cena) + cena;

        System.out.println("z podatkiem " + zceny1);
        System.out.println("z podatkiem " + zceny2);



    }
}
