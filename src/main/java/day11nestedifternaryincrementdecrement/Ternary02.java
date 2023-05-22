package day11nestedifternaryincrementdecrement;

public class Ternary02 {

    public static void main(String[] args) {

        // Ornek 1 : a < b ? a++ : ++b;

        int a = 10;
        int b = 20;

        int r1 =  a < b ? a++ : ++b;

        System.out.println(r1); // 10

        System.out.println(a); // 11

        System.out.println(b); // 20

        System.out.println("----------");

        // Ornek 2 : Verilen bir sayinin mutlak degerini hesaplayan kodu giriniz
        //      -4 --> -1 * -4          4 --> 4     0 --> 0

        int c = 4;
        int r2 = c < 0 ? -1 * c : c;

        System.out.println(r2);

        System.out.println("----------");

        // Ornek 3 : Iki sayinin isareti ayni ise bu sayilarin carpan isaretleri farkli ise
        // ""farkli isaretli sayilari carpiyorum mesaji veren kodu yazdiriniz.

        int m = 5;
        int n = -6;

        Object r3 = (m>0 && n > 0) || (m < 0 && n < 0) ? m * n : "farkli isaretli sayilari carpamiyorum";

        System.out.println(r3);

        System.out.println("----------");

        // Ornek 4 : Size verilen bir sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int p = 313;
        p = Math.abs(p);

        String r4 = (p > 99 && p < 1000) ? "uc basamaklidir" : "uc basamakli degildir";

        System.out.println(r4);

        System.out.println("----------");

    }

}
