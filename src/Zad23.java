import java.util.Scanner;

//Właściciel winnicy sadzi kilka nowych rzędów winogron i musi wiedzieć, ile sadzonek
//        ma umieścić w każdym rzędzie. Po pomiarze rzędów stwierdził, że może zastosować
//        do tego pokazany niżej wzór (uwzględnia on okratowanie, jakie trzeba zbudować po
//        obu końcach każdego rzędu):
//        V=(R-2E) /S
//        Oto wartości wykorzystywane w tym wzorze:
//        V to liczba sadzonek, jakie można umieścić w rzędzie,
//        R to długość rzędu w metrach,
//        E to ilość miejsca zajmowanego przez okratowanie,
//        S to odległość między sadzonkami w metrach.
//        Napisz program, który wykonuje potrzebne obliczenia za właściciela winnicy.
//        Program powinien wyświetlać użytkownikowi prośbę o wprowadzenie następujących
//        danych:
//        długości rzędu w metrach,
//        ilości miejsca zajmowanego przez okratowanie w metrach,
//        odległości między sadzonkami w metrach.
//        Po wprowadzeniu danych wejściowych program powinien obliczać i wyświetlać
//        liczbę sadzonek, jakie zmieszczą się w rzędzi
public class Zad23 {
    public static void main(String[] args) {
        double dlrzedu, iokratowania, odlsadzonek;

        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj ilosc sadzonek: ");
//        ilosc = scanner.nextInt();
        System.out.println("podaj dl. rzedu [m]: ");
        dlrzedu = scanner.nextDouble();
        System.out.println("podaj ilość miejsca zajmowanego przez okratowanie: ");
        iokratowania = scanner.nextDouble();
        System.out.println("podaj odleglosc sadzonek[m]: ");
        odlsadzonek = scanner.nextDouble();

        double v = iokratowania * 2;
        double wynik = (dlrzedu-v);
        wynik = wynik / odlsadzonek;
        System.out.println("pwinien sadzic co metrow: " + wynik);




    }
}
