package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

    //Ternary Statement
    // Ornek 1 : Sayi 10 dan kucuk ise console a kucuk degil yazdirin, degil ise kucuk degil yazdirin.

    //---------- if else Solution ----------

    int num = 2;

    if (num < 10) {

        System.out.println("Kucuk");

    } else {

        System.out.println("Kucuk degil");

    }

        System.out.println("----------");

    //---------- Ternary Solution ----------
    //              Condition   ?   Condition true ise calisacak kisim  :   Condition false ise calisacak kisim  ;

     String sonuc = num < 10    ?   "Kucuk"                             :   "Kucuk degil";

        System.out.println(sonuc);

        System.out.println("----------");

        // Ornek 2 : Sayi cift ise konsole a cift yazdirin tek ise tek yazdirin

        int num2 = 15;

        if (num2 % 2 == 0){

            System.out.println("Cift");

        } else {

            System.out.println("Tek");

        }

        System.out.println("----------");

        String sonuc2 = num2 % 2 == 0 ? "Cift" : "Tek";

        System.out.println(sonuc);

        System.out.println("----------");

        // Ornek 3 : Sayi 0 dan buyukse pozitif degilse ekrana pozitif degil yazdirin

        int sayi = 15;

        if (sayi < 0) {

            System.out.println("Pozitif degil");
    } else {

            System.out.println("Pozitif");

        }

        System.out.println("----------");

        String sonuc3 = sayi > 0 ? "Pozitif" : "Pozitif degil";

        System.out.println(sonuc3);

        System.out.println("----------");

        System.out.println(sayi > 0 ? "Pozitif" : "Pozitif degil"); // Atama yapmadan da kullanilabilir

        System.out.println("----------");

        // Ornek 4 : Kullanicidan 2 sayi aliniz ve buyuk olmayan sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 2 sayi giriniz");

        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        // if else

        if (num3 < num4) {

            System.out.println(num3);

        }else {

            System.out.println(num4);

        }

        System.out.println("----------");

        // Ternary

        double sonuc4 = num3 < num4 ? num3 : num4;

        System.out.println(sonuc4);

        System.out.println("----------");
    }
}
