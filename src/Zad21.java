import java.util.Scanner;

//Gdy bank wypłaca procent składany, płaci odsetki nie tylko od zdeponowanej kwoty,
//        ale też od zakumulowanej z czasem kwoty odsetek. Załóżmy, że chcesz zdeponować
//        pewną kwotę na rachunku oszczędnościowym i pozwolić na akumulowanie procentu
//        składanego przez określoną liczbę lat. Oto wzór na obliczenie stanu konta po
//        określonej liczbie lat:
//        A = P(1 +r/n)nt
//        Oto wartości z tego wzoru:
//        A to kwota pieniędzy na koncie po określonej liczbie lat,
//        P to kwota pierwotnie zdeponowana na koncie,
//        r to roczna stopa oprocentowania,
//        n określa, ile razy w roku odsetki są doliczane do kapitału,
//        t to liczba lat.
//        Napisz program, który przeprowadza takie obliczenia. Program powinien wyświetlać
//        prośbę o wprowadzenie następujących danych:
//        kwoty pieniędzy początkowo zdeponowanej na koncie,
//        rocznej stopy oprocentowania,
//        ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12,
//        a przy kapitalizacji kwartalnej — 4),
//        liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki.
//        Po wprowadzeniu danych wejściowych program powinien obliczać i wyświetlać
//        kwotę, jaka znajdzie się na koncie po określonej liczbie lat
public class Zad21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj stan kointa w USD: ");
        double stanUSD = scanner.nextDouble();
        double stanpolatach;
        double roczneoprocetownaie = 0.1;
        double lata;
        double iloscdoliczniczaniaod =4 ;

        System.out.println("podaj ilosc lat: ");
        lata = scanner.nextDouble();
        double nt = iloscdoliczniczaniaod * lata;


        stanpolatach = Math.pow(1 + roczneoprocetownaie/iloscdoliczniczaniaod, nt);
                double wynik = stanpolatach * stanUSD;
        System.out.println("stan po latach: " + wynik + "USD");

    }
}
