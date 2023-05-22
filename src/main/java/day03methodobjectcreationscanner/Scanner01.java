package day03methodobjectcreationscanner;

//java nin until kutuphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //1. Adim : Scanner Class tan obje olustur.
        Scanner input = new Scanner(System.in);

        //2. Adim : kullaniciya ne istediginize dair mesaj veriniz

        System.out.println("Lutfen yasinizi giriniz.");

        //3. Adim : Uygun method u kullanarak kullanicinin verdigi datayi memory e yerlestiriniz.

        byte age = input.nextByte();

        System.out.println(age);

        System.out.println("age = " + age);

    }

}
