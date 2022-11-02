import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liczbazjedzonych, lKalorii;
        System.out.println("podaj liczbe zjedzonych ciaseczek: ");
        liczbazjedzonych = scan.nextInt();

        lKalorii = liczbazjedzonych * 300;
        System.out.println("na " + liczbazjedzonych +  " zjedzonych ciastek" +
                " masz " + lKalorii + " kalorii");

    }
}
