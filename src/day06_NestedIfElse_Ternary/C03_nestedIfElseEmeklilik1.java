package day06_NestedIfElse_Ternary;

import java.util.Scanner;

public class C03_nestedIfElseEmeklilik1 {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin 60 yas ve uzeri Erkek 65 yas ve uzeri
        emekli olabilir. Cinsiyet ce yasini dikkate alarak "EMEKLI OLABILIRSIN" yazdirin.
        ya da "emekli olamk icin su kadar yil daha calisman geekir" yazdirin

        eger degisken sayimiz 1 den fazla ise once degiskenlerin birine gore temel iskileti kuralim
        ornegin bu soruda cinsiyete gore kuralim

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kadin icin K erkek icin E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if(cinsiyet== 'K'){ // Kadin BLOGU)
            if (yas<0){
                System.out.println("Yas 0 dan kucuk olamaz");
            } else if (yas<60) {
                System.out.println("Emekli olamazsin, daha "+ (60-yas) + " yil calisman gerekir");

            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else if (cinsiyet== 'E'){ // Erkek Blogu
            if (yas<0) {
                System.out.println("Yas 0 dan kucuk olamaz");
            }else if (yas<65) {
                System.out.println("Emekli olamazsin, daha "+ (65-yas) + " yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }
        else {
            System.out.println("Giris bilgilerini kontrol edin");
        }



    }
}
