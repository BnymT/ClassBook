package day04scannerwrapper;

import java.util.Scanner; //Scanner kullanabilmek icin gerekli kutuphane.

public class Scanner01 {

    public static void main(String[] args) {

        //Ornek 1 :Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        //1. Adim : Scanner Classtan bir obje oluştur.

        Scanner input = new Scanner(System.in); //System.in sistemin icine al.

        System.out.println(); //System.out sistemin dısına yazdir.

        // 2. Adim : Kullaniciya ne istedigimize dair mesaj veriniz.

        System.out.println("Ilk isminizi giriniz.");

        // 3. Adim : Uygun method'u kullanarak kullanicinin verdigi data'yi memeory'e yerlestiriniz.
        //Not : next() methodu kullanicidan "tek kelimeli String" almak icin kullanilir.

        String firstName = input.next();

        // 4. Adim : "Soy isiminizi giriniz." mesajını veriniz.

        System.out.println("Soy isminizi giriniz.");

        // 5. Adim : Uygun method'u kullanarak kullanicinin verdigi data'yi memeory'e yerlestiriniz.

        String lastName = input.next();

        // 6. Adim : Alinan verileri ekrana yazdiriniz.

        System.out.println(firstName + " " + lastName);

    }

}
