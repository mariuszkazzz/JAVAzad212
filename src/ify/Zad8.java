package ify;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        double lzakupionych, cena, rabat, zrabatem;
        cena = 99;
        Scanner scanner = new Scanner(System.in);
        System.out.println("poadj ilosc: ");
        lzakupionych = scanner.nextInt();

        cena = cena * lzakupionych;
        if(lzakupionych >= 100)
        {
            rabat = 0.50;
            zrabatem = rabat* cena;

            cena = cena - zrabatem;
            System.out.println("raba wynosi 50%, cena:  "+cena);
        }
        else if(lzakupionych >= 55 && lzakupionych <=99)
        {
            rabat = 0.40;
            zrabatem = rabat* cena;

            cena = cena - zrabatem;
            System.out.println("raba wynosi 40%, cena:  "+cena);
        }
        else if(lzakupionych >= 20 && lzakupionych <=49)
        {
            rabat = 0.30;
            zrabatem = rabat* cena;

            cena = cena - zrabatem;
            System.out.println("raba wynosi 20%, cena:  "+cena);
        }
        else if(lzakupionych >= 10 && lzakupionych <=19)
        {
            rabat = 0.20;
            zrabatem = rabat* cena;

            cena = cena - zrabatem;
            System.out.println("raba wynosi 20%, cena:  "+cena);
        }

    }
}
