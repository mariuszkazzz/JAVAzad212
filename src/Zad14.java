import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("podaj cene detalicza: ");
        int cenadet = scan.nextInt();
        double maza = 0.40;
        double zysk = (double) cenadet * maza;
        System.out.println("zysysk z " +cenadet + " wynosi: " + zysk);

    }
}
