package ify;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj masa[N]");
        double masa = scanner.nextDouble();
        double ciezar = masa * 9.8;
        System.out.println("ciezar[N]: " + ciezar);

        if (ciezar > 1000) {
            System.out.println("za ciezko");
        } else if (ciezar < 10) {
            System.out.println("za lekko");
        }


    }
}
