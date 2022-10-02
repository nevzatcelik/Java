package day12_ForLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
         /*
       Kullanciidan baslangic ve bitis sayilarini aliniz. sinirlar dahil olmak uzere sinirlar ve
       aralarindaki sayilardan bes ile bolunebilenleri yazdirin.
       //NOT kullanici once buyuk sayi sonra kucuk sayi girebilir
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN BIR BASLANGIC SAYISI GIRINIZ");
        int baslangic=scan.nextInt();
        System.out.println("LUTFEN BIR BITIS SAYISI GIRINIZ");
        int bitis= scan.nextInt();

        if (baslangic>bitis){
            for (int i = baslangic; i >=bitis ; i--) {
                if(i%5==0) System.out.print(i + " ");
            }

        } else
            for (int i = baslangic; i <=bitis ; i++) {

            if(i%5==0) System.out.print(i + " ");
        }
    }
}
