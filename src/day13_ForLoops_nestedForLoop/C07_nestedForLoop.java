package day13_ForLoops_nestedForLoop;

public class C07_nestedForLoop {
    public static void main(String[] args) {
        /*
        Asagidaki sekli olusturan bir program yaziniz
        kac satir oldugu ve satirda kac yildiz olacak input olarak veriliyor

        *
        * *
        * * *
        * * * *

         */

        int satir=8;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
