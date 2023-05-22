package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        /*Kullanicidam alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2 basamagindaki
        rakamlarim toplamini yazdiran kodu giriniz.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz.");

        int number = input.nextInt();

        /*Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani aliriz.
        Bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tam sayi yapar.
        Nasil yapar?
        Ondalik kismi iptal eder, java yuvarlama yapmaz.
        // % modulus operator : Solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
         */

        //5. basamaktaki rakami al.
        int a = number % 10;

        //4. basamaktaki rakami al.
        number = number / 10;
        int b = number % 10;

        //3. basamaktaki rakami al.
        number = number / 10;
        int c = number % 10;

        //2. basamaktaki rakami al.
        number = number / 10;
        int d = number % 10;

        //1. basamaktaki rakami al.
        number = number / 10;
        int e = number % 10;

        System.out.println(a+b+d+e);

        /*
        Homework

        1) Kullanicidan aldiğiniz 3 tane sayinin ortalamasini bulan kodu yaziniz.
        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz.
         */



    }

}
