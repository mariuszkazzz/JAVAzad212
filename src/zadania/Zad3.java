package zadania;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class Zad3 {
    public static void main(String[] args) throws IOException {

        Scanner scaner = new Scanner(System.in);
        System.out.println("podaj predkoc i ilosc godzin: ");
        double predkosc = 0;
        double suma;
        int ilosc;
        System.out.println("Podaj nazwę pliku");

        String nazwaPliku = scaner.nextLine();

        FileWriter fw = new FileWriter(nazwaPliku,true);

        PrintWriter pw = new PrintWriter(fw);


        predkosc = scaner.nextByte();
        ilosc = scaner.nextInt();


        for (int i = 0; i <= ilosc; i++)
        {
            suma = predkosc*i;
            //i = i+1;
            System.out.println("trasa po  "+i+"wynosi: " + suma);
            pw.println(suma);

        }
        pw.close();


    }
}
