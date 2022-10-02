package day03_matematikselislemler_Increment;

import java.util.Scanner;

public class C02_Casting {
    public static void main(String[] args) {
        /*
        Kullanicidan iki double sayi alin ilk sayiyi ikinci sayoya bolun ve bolum isleminin sonucunun
        tam sayi kismina yazdirin
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("iki ondalikli sayi girin,\narada entere basinn");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int sonuc=(int)(sayi1/sayi2);
        System.out.println("bolme isleminin tam sayi kismi:"+ sonuc);




    }
}
