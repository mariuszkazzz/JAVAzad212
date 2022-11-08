package ify;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String i1, i2, i3;
        double t1, t2, t3;

        System.out.println("poadj kolejno imiona: ");
        i1 = scanner.nextLine();
        i2 = scanner.nextLine();
        i3 = scanner.nextLine();

        System.out.println("poadj kolejno czasy [minuty]: ");
        t1 = scanner.nextDouble();
        t2 = scanner.nextDouble();
        t3 = scanner.nextDouble();

        if (t1 < t2 && t1 < t3)
        {
            System.out.println(i3);
            if(t3<t2)
            {
                System.out.println(i3);
                System.out.println(i2);
            }
            if(t2<t3)
            {
                System.out.println(i2);
                System.out.println(i3);
            }
        }
        else if (t2 < t1 && t2 < t3)
        {
            System.out.println(i2);
            if(t1<t3)
            {
                System.out.println(i1);
                System.out.println(i3);
            }
            if(t3<t1)
            {
                System.out.println(i3);
                System.out.println(i1);
            }
        }
        else if (t3 < t1 && t3 < t2)
        {
            System.out.println(i3);
            if(t1<t2)
            {
                System.out.println(i1);
                System.out.println(i2);
            }
            if(t2<t1)
            {
                System.out.println(i2);
                System.out.println(i1);
            }
        }




    }
}
