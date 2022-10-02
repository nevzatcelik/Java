package day12_ForLoops;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
       /*
       Kullanciidan baslangic ve bitis sayilarini aliniz. sinirlar dahil olmak uzere sinirlar ve
       aralarindaki sayilardan bes ile bolunebilenleri yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN BIR BASLANGIC SAYISI GIRINIZ");
        int baslangic=scan.nextInt();
        System.out.println("LUTFEN BIR BITIS SAYISI GIRINIZ");
        int bitis= scan.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }

        }




    }
}
