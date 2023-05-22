package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {

    public static void main(String[] args) {

        // Ornek 1 : Bir string in belirli bir karakterindem baslayarak belirli bir karaktere kadar dynamic olarak aliniz.
        // abc@gmail.com --> gmail.

        String a = "abc@gmail.com";
        int startingIndex = a.indexOf('@')+1;
        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex,endingIndex);

        System.out.println("companyName = " + companyName); // companyName = gmail

        // Ornek 2 : Verile iki string in birbirinin aynisi olup olmadgini kontrol eden kodu giriniz.

        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);

        System.out.println("result = " + result);

//-------------------------------------------------------------------------------------------------------

        /* Java da Memory kullanimi

            Javada 2 adet memory tipi vardir.
            1) Stack Memory --> small
                a) Kucuk memory dir.
                b) Primitive data lari ve Non-Primitive data larin adreslerini (reference) tutar.

            2) Heap Memory --> Huge
                a) Buyuk memory dir.
                b) Non-Primitive data type lari icerir.
                --> Java heap memory de yerlestirilen tum Non-Primitive datalar icin bir adres olusturur
                ve bu adresi stack memory de saklar.

            Note : String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
            Peki neden?
            Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hem de degerlerine bakari
            ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adresleri
            ile degil degerleri ile ilgileniriz.Bu yuzden String karsilastirmalarinda "==" kullanmayiz

            "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni
            ise bu iki string esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod
            yazarken ihtiyac duyudugumuz seydir.

        */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t); // false verir cunkü adresler ve degerler farklidir.

        System.out.println(s.equals(t)); // false verir cunku degerler farkli.

        System.out.println(s == r); // false cunku adresler farkli.

        System.out.println(s.equals(r)); // true verir cunku adrese bakilmaz degerler karsilastirilir.

//-------------------------------------------------------------------------------------------------------
        // Ornek 3 : Verilen 2 string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate
        // almadan kontrol eden kodu yaziniz.

        String j = "ali Can";
        String k = "Ali Can";
        boolean result2 = j.equalsIgnoreCase(k);

        System.out.println("result2 = " + result2); // true

        /*
        Homework

        1) Bir String variable olusturunuz ve bu stringdeki rakam olmayan tum karakterlerin sayisini
        konsola yazdiriniz.

        2) Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tüm karakterleri
        konsola buyuk harflerle yazdiriniz.

        3) Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ASCII degerleri
        toplamini console a yazdiriniz.

        4) Tek kelimeli bir sehir ismi icin String variable olusturun ve sehir isminin ilk harfini
        buyuk harfle diger harflerini kucuk harflerle konsola yazdirin.

        5) Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
            a) En az 6 karakter olmali.
            b) En az bir tane buyuk harf olsun
            c) en az bir tane kucuk harf olsun
            d) En az bir tane rakam olsun.

        Note 1 : Once canli oturum sirasinda cozulen ornekleri tekrar ediniz.
        Note 2 : Tum sorular dynamic kodlarla cozulmelidir.
        Note 3 : Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir ve ya yardim isteyebilirsiniz.

         */
    }

}
