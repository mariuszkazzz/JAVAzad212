import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj cena jedzenia: ");
        double cena = scanner.nextDouble();
        System.out.println(cena);

        double podatek, napiwek, lacznaCena;
        podatek = 0.0625;
        napiwek = 0.2;

        double cenazpodatku = cena* podatek;
        double cenaznapiwek = cena* napiwek;
        lacznaCena = cenaznapiwek + cenazpodatku + cena;
        System.out.println("kolejno cena jedzenia: " + cena + " podetek: "
                + cenazpodatku + " napiwek: "+ cenaznapiwek + " suma: " + lacznaCena);






    }
}
