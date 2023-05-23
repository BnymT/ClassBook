package day14loops;

public class Loops01 {

    public static void main(String[] args) {

        // Ornek 1 : Bir string i ters ceviren kodu giriniz
        // "Java" --> "avaJ"

        String s1 = "Java";

        for (int i = s1.length() - 1 ; i >= 0 ; i--) {

            char ch = s1.charAt(i);

            System.out.print(ch);

        }

        System.out.println();

        for (int i = s1.length() - 1 ; i >= 0 ; i--) {

            String s2 = s1.substring(i , i + 1);

            System.out.print(s2);

        }

        System.out.println();

        // Ornek 2 : Size verilen bir string in palindrome olup olmadigini kontrol ediniz.
        // Soldan saga ve sagdan sola okunusu ayni olan cumleler palindrome dur.

        String s3 = "ey edip adanada pide ye";
        String s4 = "";

        for (int i = s3.length() - 1 ; i >= 0 ; i--) {

            s4 = s4 + s3.charAt(i);

        }

        if (s4.equalsIgnoreCase(s3)) {

            System.out.println("Cumleler palindrome kuralina uyar");

        } else {

            System.out.println("Cumleler palindrome kuralina uymaz");

        }

    }

}
