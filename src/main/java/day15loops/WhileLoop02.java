package day15loops;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*               3 ==> 3x1=3
                         3x2=6
                         3x3=9
                         3x4=12 ...
                         3x10=30*/

        Scanner input = new Scanner(System.in);

        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz.");

        int num = input.nextInt();
        int i = 1;

        while (i < 11) {

            System.out.println(num + " x " + i + " = " + (num * i));

            i++;

        }

        System.out.println();

        //Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz
        //      Java  ==> J*a*v*a*

        System.out.println("Bir kelime giriniz");

        String word = input.next();
        String newWord = "";

        int j = 0;

        while (j < word.length()) {

            newWord += word.charAt(j) + "*";

            j++;

        }

        System.out.println(newWord);

        //Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz
        // kertenkelle  ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6
        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String word2 = "kertenkele";
        String word3 = "";
        int k = 0;

        while (k < word2.length()) {

            char letter = word2.charAt(k);

            if (word2.indexOf(letter) == word2.lastIndexOf(letter)) {

                word3 += letter;


            }

            k++;

        }

        System.out.println(word3);

    }

}
