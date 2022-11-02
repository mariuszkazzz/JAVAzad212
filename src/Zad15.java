import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj ulubione maisto: ");
        String miasto = scan.nextLine();
        System.out.println("ulubione maisto: " + miasto);
        int dlugosc = miasto.length();
        String duze = miasto.toUpperCase();
        String male = miasto.toLowerCase();
        System.out.println(miasto+", "+ dlugosc+", "+ duze+", "+ male);


    }
}
