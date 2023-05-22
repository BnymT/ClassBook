package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        /*Ornek : Kullanicidan bir dikdörtgenin 2 kenar uzunlugunu aliniz.
        a) Alanini hesaplayiniz.
        b) Cevresimi hesaplayiniz.
         */

        Scanner input = new Scanner(System.in);

        double shortSide;
        double longSide;

        System.out.println("Enter the short side please.");

        shortSide = input.nextDouble();

        System.out.println("Enter the long side please");

        longSide = input.nextDouble();

        double perimeter = 2*(shortSide + longSide);

        double area = shortSide * longSide;

        System.out.println("Perimeter of Rectangle = " + perimeter);

        System.out.println("Area of Rectangle =" + area);

    }

}
