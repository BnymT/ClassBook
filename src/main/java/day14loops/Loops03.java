package day14loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen baslangic degeri giriniz");

        int num1 = input.nextInt();

        System.out.println("Lutfen bitis degeri giriniz");

        int num2 = input.nextInt();

        if (num1 > num2) {

            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");

            for (int i = num1 ; i <= num2 ; i++){

                if (i % 2 == 0){

                    System.out.print(i + " ");

                }

            }

        }

        // Ornek 2 : Hic sayi kullanmadan 1 den 100 e kadar olan sayilari konsole a yazdiriniz.

        for (int i = 'd'/'d' ; i <= 'd' ; i++) {

            System.out.print(i + " ");

        }

         /*
       Note 1) Bazi looplar sonsuz defa calisabilir, bu tarz looplara inifinite (sonsuz) loop denir
       sonsuz loop genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir

        for (int i =1; i < 10; i--) {

        }

        Note 2) Loop olusturdugumuzda ikinci kismi yazmazsaniz sonsuz loop olusur
                for (int i = 0;  ; i++) {

        }

        Note 3) Bazi looplar hic calismayabilir

               for (int i = 1; i <0 ; i--) {

        }
         */

    }

}