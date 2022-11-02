public class Zad17 {
    public static void main(String[] args) {

        double akcja, liczbaA , cenaA, cenaP, prowizja, calosc, all;
        akcja = 21.77;
        liczbaA = 600;
        cenaA = liczbaA * akcja;
        System.out.println("cena bez prowiji: " + cenaA);
        prowizja = 0.02;
        cenaP = cenaA * prowizja;
        System.out.println("prowizja: " + cenaP);
        all = cenaA + cenaP;
        System.out.println("calosc: " + all);






    }
}
