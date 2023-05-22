package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        double firstNumber;
        double secondNumber;

        System.out.println("Lütfen birinci sayiyi giriniz.");

        firstNumber = input.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz.");

        secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);

        System.out.println(firstNumber - secondNumber);

        System.out.println(firstNumber * secondNumber);

        System.out.println(firstNumber / secondNumber);

    }

}
