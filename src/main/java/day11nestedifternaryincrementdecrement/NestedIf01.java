package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz");

        String gender = input.next();

        boolean genderReqWomen = gender.equalsIgnoreCase("Kadin");

        boolean genderReqMan = gender.equalsIgnoreCase("Erkek");

        System.out.println("Lutfen yasinizi giriniz.");

        int age = input.nextInt();

        boolean ageReq = (age < 0 || age > 120);

        if (ageReq){

            System.out.println("Lutfen yasinizi 0 ile 120 arasinda giriniz.");

        } else if (genderReqMan) {

            if (age > 65) {

                System.out.println("Emekli olabilirsiniz.");

            } else {

                System.out.println("Calismali.");

            }

        } else if (genderReqWomen) {

            if (age > 60) {

                System.out.println("Emekli olabilirsiniz.");

            } else {

                System.out.println("Calismali");

            }

        } else {

            System.out.println("Tanimlanamayan deger.");

        }

    }

}
