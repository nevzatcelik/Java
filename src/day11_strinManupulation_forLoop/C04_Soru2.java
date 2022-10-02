package day11_strinManupulation_forLoop;

import java.util.Scanner;

public class C04_Soru2 {
    public static void main(String[] args) {
        /* kullanicidan bir sayi alin
        sau'yi 3 ile bolunuyorsa " 3 ile bolunen sayi"
        5 ile bolunuyorsa " 5 ile bolunen sayi "
        hem 3 hem 5 e bolunuyorsa "super sayi"
       geriye kalanlar onemsiz sayi

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0 && girilenSayi%5==0 ) {
            System.out.println("super sayi");
        } else if (girilenSayi%3==0) {
            System.out.println("3 e bolunebilen sayi");
        }else if (girilenSayi%5==0) {
            System.out.println("5 e bolunebilen sayi");
        } else {
            System.out.println("3 veya 5 veya her ikisine de bolunemeyen sayi");
        }

          // kendi cozumum !!!
    }
}
