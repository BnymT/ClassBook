package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {

        double kup =getCube(5);

        System.out.println("kup = " + kup);

        print("Java is easy");

        //Method olusturmak icin 2. yol
        //Ornek 2 2.yol : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //Main method icinde iken method ta kullanilacak olan variable lari olusturunuz.

        String str = "TechProEdu";

        //Method ismi ve parametreleri yaziniz.
        //Kirmizi kismin uzerinde bekleyip create methoda tiklariz IneliJ otomatik olarak bir method olusturur.
        //Daha sonra kendi istegimize göre dizayn ederiz.
        printConsole(str);

        //Verilen iki tam sayiyi carpan be sonucu ekrana yazdiran methodu olusturup kullaniniz.

        int a = 3;
        int b = 5;

        carpmaYap(a,b);

        //Ornek 4 : Verilen bir tamsayinin karsini hesaplayip console a yazdiran methodu olusturup kullaniniz.

        int c = 6;

        kare(c);

    }

    private static void kare(int c)
    {

        System.out.println(c*c);

    }

    private static void carpmaYap(int a, int b)
    {

        System.out.println(a*b);

    }

    private static void printConsole(String str)
    {



    }

    //Ornek 1 : Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    static double getCube(double a)
    {

        return a * a * a;

    }

    //Note : Acces modifier i default yapmak isterseniz acces modifier i YAZMAYINIZ...

    //Ornek 2 : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void print(String str)
    {

        System.out.println(str);

        //Eger bir method yeni bir data uıretmiyor ise return tyoe i void olur
        //Methodun return type i void ise method boyd icinde return keywordu yazilmaz.


    }

    /*
    Homework
    1) Cemberin cevresini hesaplayan methodu olusturunuz ve hesaplayiniz.
    2) Dairenin alanini hesaplayan methodu olusturunuz ve hesaplayiniz.
     */

}
