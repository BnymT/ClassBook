package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 21 ; i < 181 ; i++) {

            if (i % 2 == 0 && i % 3 == 0) {

                System.out.print(i + " ");

            }

        }

        System.out.println();

        // Ornek 2 : Size verilen kucuk harfle yazilmis Stringini index i cift sayi olan karakterlerini buyuk harfle yazdiriniz

        String s1 = "ankara";

        for (int i = 0 ; i < s1.length() ; i++) {

            String ch = s1.substring(i , i + 1);

            if (i % 2 == 0) {

                System.out.println(ch.toUpperCase());

            }

        }

        // Ornek 3 : Verilen bir String de ilk a harfinden onceki tum karakterleri konsola yazdiriniz.
        // "I love Java"

        String s2 = "Tramvay";

        for (int i = 0 ; i < s2.length() ; i++) {

            char ch = s2.charAt(i);

            if (ch == 'a') {

                break;

            }

            System.out.print(s2.charAt(i));

        }
        System.out.println();

        System.out.println("----------");

        // Ornek 4 : Verilen bir string de son 'a' dan sonraki tum karakterileri ter sirada yazdiriniz

        String s3 = "Germany";

        for (int i = s3.length() - 1 ; i >= 0 ; i-- ) {

            char ch2 = s3.charAt(i);

            if (ch2 == 'a') {

                break;

            }
            System.out.print(s3.charAt(i));

        }

    }

}