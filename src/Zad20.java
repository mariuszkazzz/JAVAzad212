import java.util.Scanner;

//W przepisie na ciasteczka podana jest następująca ilość składników:
//        1,5 szklanki cukru,
//        1 szklanka masła,
//        2,75 szklanki mąki.
//        Te składniki pozwalają upiec 48 ciasteczek. Napisz program, który wyświetla
//        użytkownikowi prośbę o wpisanie oczekiwanej liczby ciasteczek, a następnie
//        informuje, ile szklanek poszczególnych składników potrzeba do uzyskania tej liczby.
public class Zad20 {
    public static void main(String[] args) {
        //48
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj l. ciastek: ");
        int lcziatek = scanner.nextInt();

        double lszcukru = cukier/48;
        double lszmasla = maslo/48;
        double lszmoki = maka/48;

        System.out.println("szk. masla: " + lszmasla);
        System.out.println("szk. maki: " + lszmoki);
        System.out.println("szk. cukru: " + lszcukru);





    }
}
