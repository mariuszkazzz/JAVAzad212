import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner wpisywanie = new Scanner(System.in);
        double liczbaKM, liczbaL;

        System.out.println("podaj l. kilometrow: ");
        liczbaKM = wpisywanie.nextDouble();
        System.out.println("podaj l. zuzytego paliwa: ");
        liczbaL = wpisywanie.nextDouble();
        System.out.println(" ");
        double litrNaKm;
        litrNaKm = liczbaKM / liczbaL;
        System.out.println("wynik: " + litrNaKm);

    }
}
