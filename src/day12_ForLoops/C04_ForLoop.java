package day12_ForLoops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan Pozitif bir tam sayi alin
        1 den o sayiya kadar(sayi dahil) tum sayilarin toplamini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN POZITIF BIR TAM SAYI GIRINIZ");
        int sayi= scan.nextInt();

        int sayiToplami=0;

        for (int i = 1; i <=sayi ; i++) {
            sayiToplami+=i;

          }
        System.out.println("Toplam : " + sayiToplami);
    }

}
