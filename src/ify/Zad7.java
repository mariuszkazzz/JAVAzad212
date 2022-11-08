package ify;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("poadj kolejno imiona: ");
        String[] imiona = new String[3];
        for (int i = 0; i <= 3; i++) {
            imiona[i + 1] = scanner.nextLine();
        }

        if (imiona[1].compareToIgnoreCase(imiona[2]) < 0){
            System.out.println(imiona[1] + " jest pierwszy alfabetycznie  " );
        }
        else if (imiona[1].compareTo(imiona[2]) == 0) {
            System.out.println(imiona[1] + " jest równy względem " + imiona[2] + ".");
        }
        else if (imiona[1].compareTo(imiona[2]) > 0){
            System.out.println(imiona[2] + " jest pierwszy alfabetycznie");
        }

        if (imiona[1].compareToIgnoreCase(imiona[3]) < 0){
            System.out.println(imiona[1] + " jest pierwszy alfabetycznie  " );
        }
        else if (imiona[1].compareTo(imiona[3]) == 0) {
            System.out.println(imiona[1] + " jest równy względem " + imiona[3] + ".");
        }
        else if (imiona[1].compareTo(imiona[3]) > 0){
            System.out.println(imiona[3] + " jest pierwszy alfabetycznie");
        }

        if (imiona[3].compareToIgnoreCase(imiona[2]) < 0){
            System.out.println(imiona[1] + " jest pierwszy alfabetycznie  " );
        }
        else if (imiona[3].compareTo(imiona[2]) == 0) {
            System.out.println(imiona[1] + " jest równy względem " + imiona[2] + ".");
        }
        else if (imiona[3].compareTo(imiona[2]) > 0){
            System.out.println(imiona[2] + " jest pierwszy alfabetycznie");
        }






    }
}
