import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int[] oceny = {0, 0, 0};
        //int suma;

        for (int i =0; i < 3; i++){
            System.out.println("podaj ocene: "+ (i+1));
            oceny[i] = scan.nextInt();
            //System.out.println("ocena: " + oceny[i]);

        }

        for (int i =0; i < 3; i++){

            System.out.println(oceny[i]);

        }

        for (int i = 0; i < oceny.length; i++) {
            //suma += oceny[i];
        }

        double srednia;

    }
}
