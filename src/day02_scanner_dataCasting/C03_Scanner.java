package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir double bir de int sayi alin bunlarin toplamini ve carpimini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayı giriniz");
        int tamsayı=scan.nextInt();

        System.out.println("lutfen ondalıklı bir sayı giriniz");
        double ondalıklıSayı= scan.nextDouble();

        System.out.println("girilen sayıların carpımı = " + tamsayı*ondalıklıSayı);
        System.out.println("girilen sayıların toplamı = " + (tamsayı+ondalıklıSayı));

    }
}
