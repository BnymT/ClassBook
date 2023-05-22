package day03methodobjectcreationscanner;

public class Homework {

     /*
    Homework
    1) Cemberin cevresini hesaplayan methodu olusturunuz ve hesaplayiniz. Cember Cevre = 2*3,1416*r
    2) Dairenin alanini hesaplayan methodu olusturunuz ve hesaplayiniz.
     */



    public static void main(String[] args) {

        int radius = 5;

        System.out.println("circumferenceOfCircle(radius) = " + circumferenceOfCircle(radius));

        System.out.println("----------");

        System.out.println("areaOfCircle(radius) = " + areaOfCircle(radius));

    }

    private static double circumferenceOfCircle(int radius) {

        return radius*2*3.1416;

    }
    
    private static double areaOfCircle (int radius){
        
        return radius*radius*3.1416;
        
    }
    
    



}
