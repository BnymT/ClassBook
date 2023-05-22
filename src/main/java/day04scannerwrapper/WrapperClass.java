package day04scannerwrapper;

public class WrapperClass {

    public static void main(String[] args) {

        //Primitive     : char      - boolean - byte - short - int     - long - float - double
        //Wrapper Class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

        //Wrapper Class lar non-primitive dir. O yüzden memory de cok yer kaplar.
        //Dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz.
        //"n." komutu ile hic method goremezsiniz, cunku primitive data method icermez.
        int n = 12;

        //"m." komutu ile bircok method gorebilirsiniz cünkü wrapper classlar method icerir.
        Integer m = 12;

        byte a = 5;
        Byte b = 5;

        //Ornek : short data type ini minimum ve maximum degerlerini kod yazarak bulunuz.

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2 : int data type ini minimum degeri ile byte data type maximum degerlerinin toplamini bulunuz.

        int minInt = Integer.MIN_VALUE;

        byte maxByte = Byte.MAX_VALUE;

        int addition = minInt + maxByte;

        System.out.println("addition = " + addition);

        //Ornek 3 : Primitive int i wrapper Integer a ceviriniz.

        int num = 12;

        Integer wrapperNum = num; //Autoboxing

        //Ornek 4 : Wrapper byte i primitive byte a ceviriniz.

        Byte wrapperByte = 20;

        byte num2 = wrapperByte; //Unboxing

        //Ornek 5 : Primitive char i Wrapper Character e donusturunuz.

        char letter = 'a';

        Character wrapperLetter = letter;

        //Ornek 6 : Wrapper boolean i primitive boolean a ceviriniz.

        Boolean wrapperQuestion = false;

        boolean question = wrapperQuestion;

    }

}
