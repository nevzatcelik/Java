package day06_NestedIfElse_Ternary;

import java.util.Scanner;

public class C02_IfElseIf_EmeklilikSorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin 60 yas ve uzeri Erkek 65 yas ve uzeri
        emekli olabilir. Cinsiyet ce yasini dikkate alarak "EMEKLI OLABILIRSIN" yazdirin.
        ya da "emekli olamk icin su kadar yil daha calisman geekir" yazdirin

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kadin icin K erkek icin E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet== 'K'&& yas>=60) {
            System.out.println("emekli olabilirsin");

        } else if (cinsiyet== 'K' && yas<60) {
            System.out.println("Emekli olamazsin daha "+(60-yas)+ " yil calisman gerekir");
        } else if (cinsiyet== 'E' && yas>=65) {

            System.out.println("Emekli olabilirsin");
        } else if(cinsiyet== 'E' && yas<65) {

            System.out.println("Emekli olamazsin daha "+ (65-yas) +" yil calisman gerekir");
        } else {

            System.out.println("girisleri kontrol edip yeniden deneyin");
        }

    }
}
