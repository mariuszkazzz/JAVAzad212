package ify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("poadj kolejno imiona: ");
        String[] imiona = new String[3];
        int[] czas = new int[3];

        for (int i = 0; i <= 3; i++) {
           imiona[i + 1] = scanner.nextLine();
        }

        System.out.println("poadj kolejno czasy: ");
        for (int i = 0; i <= 3; i++) {
            czas[i + 1] = scanner.nextInt();
        }



    }
}
