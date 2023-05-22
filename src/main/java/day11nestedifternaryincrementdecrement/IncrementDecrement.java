package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {

    public static void main(String[] args) {

        // Increment

        int a = 5;

        System.out.println(a); // 5

        a = a + 2;

        System.out.println(a); // 7

        a += 2;

        System.out.println(a); // 9

        System.out.println("----------");

        // Ornek 1 : Bir tane int variable olusturun ve onu 2 sekilde 5 artirin

        int b = 10;

        System.out.println(b);

        b = b + 5;

        System.out.println(b);

        b += 5;

        System.out.println(b);

        System.out.println("----------");

        // Decrement

        int c = 7;

        System.out.println(c);

        c = c - 2;

        System.out.println(c);

        c -= 2;

        System.out.println(c);

        System.out.println("----------");

        // Increment 2

        int d = 10;

        System.out.println(d);

        d = d * 2;

        System.out.println(d);

        d *= 2;

        System.out.println(d);

        System.out.println("----------");

        // Decrement 2

        int e = 20;

        System.out.println(e);

        e = e / 2 ;

        System.out.println(e);

        e /= 2;

        System.out.println(e);

        System.out.println("----------");

        // "1" ile increment

        int f = 12;

        /*
         f = f + 1;
         f += 1;
         f++; KULLANILMASI GEREKEN
         */

        int h = 10;

        /*
        h = h - 1;
        h -= 1 ;
        h--; KULLANILMASI GEREKEN
         */

        System.out.println("----------");

        // "post-increment" ve "pre-increment"

        int i = 10;
        int k = i++;

        System.out.println(i); // 11

        System.out.println(k); // 10

        System.out.println("----------");

        int m = 15;
        int n = ++m;

        System.out.println(m); // 16

        System.out.println(n); // 16

        System.out.println("----------");

        int p = 17;
        int r = p--;

        System.out.println(p); // 16

        System.out.println(r); // 17

        System.out.println("----------");

        int s = 20;
        int t = --s;

        System.out.println(s);

        System.out.println(t);

        System.out.println("----------");


    }

}
