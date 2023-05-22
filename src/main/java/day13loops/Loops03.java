package day13loops;

public class Loops03 {

    public static void main(String[] args) {

        // Ornek 1 :Verilen bir string de kucuk harfleri console a yazdirmayiniz.
        //"Pwd12?Ab" --> P12?A

        String s1 = "Pwd12?Ab";

        for (int i = 0 ; i < s1.length() ; i++) {

            char ch = s1.charAt(i);

            if (ch > 'a' && ch <= 'z') {

                continue; // else koymaya gerek yok burada amac continue method unu ogretmek

            } else {

                System.out.print(ch);

            }

            /*
            "break" ile "continue" arasindaki fark nedir?
            "break" switch in disina cikmak icin ve loop u kirmak icin kullanilir.
            "continue" ise loop yaparken bazi elemanleri isleme sokmamak cin kullanilir.
            "continue" keyword u bir looptaki gecerli iteration i sonlandirip sizi artirma/azaltma bolumune goturur.
             */

        }

    }

}
