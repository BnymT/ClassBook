package day15loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // while

       /* baslangic degeri
                while(Loop calisma kurali) {

                    calisacak kodlar

                    artirma / azaltma

        }*/

        // do while

       /* baslangic degeri

                do {
                    calisacak kodlar

                    artirma / azaltma

                }while (Loop calisma kurali)*/

        // Ornek 1 : 5 (dahil) den 3 (dahil) e kadar tum tamsayilari console a yazdiriniz

        int a = 5;

        do {

            System.out.print(a + " ");

            a--;

        } while (2 < a);

        // 1 while-loop

        int i = 1;

        while (i < 1) {

            System.out.println("Sen bir while loopsun...");

            i++;

        }

        // 2 do while-loop

        int j = 1;

        do {

            System.out.println("Sen bir do while loopsun...");
            j++;

        } while (j < 1);

    }

}
