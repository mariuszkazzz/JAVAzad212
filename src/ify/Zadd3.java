
package ify;


import java.util.Scanner;

public class Zadd3 {
    public static void main(String[] args) {
        double waga, wzrost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wage i zwrost: ");
        waga = scanner.nextDouble();
        wzrost = scanner.nextDouble();

        wzrost = wzrost*2;
        double bmi = waga/wzrost;
        System.out.println("bmi: "+ bmi);

        if(bmi >= 18.5 && bmi >= 25 )
        {
            System.out.println("optymalnie");
        }
        else if (bmi < 18.5){
            System.out.println("niedowaga");

        }
        else{
            System.out.println("nadwaga");
        }


    }
}
