package day12_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {

         /*
         1 den 100 e kadar olan sayilari yan yana aralarinda bir bosluk birakarak yazdiralim

          */

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+ " ");

        }

        System.out.println("");
        /* 1 den 100 e kadar 100 dahil dayilardan 3 ile bolunebilenleri yan yana aralarinda bosluk
        olacak sekilde yazdiralim
         */

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0) System.out.print(i + " ");

        }
        /*
        1 den baslayarak sayilari 3 er 3 er arttirarak yazdiralim 100 e kadar (100 ust sinir)
         */
        System.out.println("");



        for (int i = 1; i <=100 ; i+=3) {
            System.out.print(i + " ");

        }


    }
}
