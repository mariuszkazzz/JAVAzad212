//. Producent napojów bezalkoholowych przeprowadził ankietę z udziałem 12 467
//        konsumentów i odkrył, że około 14% ankietowanych kupuje przynajmniej jeden
//        napój energetyczny tygodniowo. Około 64% kupujących napoje energetyczne
//        preferuje smak cytrusowy. Napisz program wyświetlający następujące informacje:
//        przybliżoną liczbę ankietowanych osób, które kupują przynajmniej jeden napój
//        energetyczny tygodniowo;
//        przybliżoną liczbę ankietowanych osób, które preferują napoje energetyczne o
//        smaku cytrusowym.

public class Zad19 {
    public static void main(String[] args) {
        int lankietowanych = 12467;
        double jedentygodniowo = 0.14; //z liczby ankietowanych
        double smakcytrus = 0.64; //z jeden tyg

        double ljedennapoj;
        ljedennapoj = lankietowanych * jedentygodniowo;
        System.out.println("pijacy napoje: "+ ljedennapoj);

        double cytrynowe = ljedennapoj * smakcytrus;
        System.out.println("pijacy napoje o smaku cytrusowym: "+ cytrynowe);






    }
}
