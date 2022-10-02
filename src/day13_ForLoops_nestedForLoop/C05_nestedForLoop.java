package day13_ForLoops_nestedForLoop;

public class C05_nestedForLoop {
    public static void main(String[] args) {
        /*
        Asagidaki sekli olusturan bir program yaziniz
        kac satir oldugu ve satirda kac yildiz olacak input olarak veriliyor

        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *

         */

        int satirSayisi=6;
        int satirdakiyildizSayisi=13;

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=satirdakiyildizSayisi ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
