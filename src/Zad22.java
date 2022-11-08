//W zeszłym miesiącu Jacek kupił trochę akcji firmy Acme Software. Oto szczegóły tej
//        transakcji:
//        liczba zakupionych akcji: 1000,
//        cena zakupu akcji: 32,87 złotego za akcję, prowizja wypłacona brokerowi: 2% ceny
//        akcji.
//        Po dwóch tygodniach Jacek sprzedał akcje. Oto szczegóły transakcji sprzedaży:
//        liczba sprzedanych akcji: 1000,
//        cena sprzedaży akcji: 33,92 złotego za akcję,
//        prowizja wypłacona brokerowi: 2% ceny akcji.
//        Napisz program wyświetlający następujące informacje:
//        kwotę zapłaconą przez Jacka za akcje,
//        wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie,

import java.util.Scanner;

//        kwotę otrzymaną przez Jacka ze sprzedaży akcji,
//        wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży,
//        zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji (jeśli wysokość zysku
//        m jest ujemna, oznacza to, że Jacek poniósł stratę)
public class Zad22 {
    public static void main(String[] args) {
        int lakcji = 1000;
        double cenazakupu = 33.97;
        double prowizja = 0.02;
        double kwotaZaplacona = lakcji * cenazakupu;
        double wprowizji = kwotaZaplacona * prowizja;
        double kwotaZaplaconazprow = wprowizji + kwotaZaplacona;
        System.out.println("prowizja: " + wprowizji + " za wszystko zaplacil: " + kwotaZaplaconazprow);

        Scanner scanner = new Scanner(System.in);
        double zailesprzeda, ilosc;
        System.out.println("za ile sprzda akcje: ");
        zailesprzeda = scanner.nextDouble();
        System.out.println("ile akcji: ");
        ilosc = scanner.nextInt() ;
        double wynik = ilosc * zailesprzeda;
        double p = wynik * prowizja;
        wynik = wynik + p;
        wynik = wynik - kwotaZaplaconazprow;
        if(wynik>0)
            System.out.println("zyskal, bilans: "+ wynik);
        else
            System.out.println("stracil, bilans: "+ wynik);







    }
}
