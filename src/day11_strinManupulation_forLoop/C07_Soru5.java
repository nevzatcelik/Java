package day11_strinManupulation_forLoop;

import java.util.Scanner;

public class C07_Soru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyin
        asagidaki sartlari kontrol ederek
        kullaniciya duzeltesi gerekenleri soyleyin
        eger tum sartlari saglarsa " sifre basariyla kaydedildi" yazdirin

        sart1- ilk harf kucuk harf olami
        sart2- son karakter rakam olmali
        sart3- sifre bosluk icermemeli
        sart4- uzunlugu en az 10 karakter olamli
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre= scan.nextLine();

        // bagimsiz if cumleleri veya if else ile cozulebilir
        // ikisininde artilari ve eksileri var
        // biz bagimsiz if i sectik

        boolean kontrol=true;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {
            System.out.println("sifre kucuk harf ile baslamali");
            kontrol=false;
        }

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("sifre rakam ile bitmeli");
            kontrol=false;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk iceremez");
            kontrol=false;
        }

        if (sifre.length()<10) {
            System.out.println("sifre en az 10 karakterli olmalidir");
            kontrol=false;

        }
        if (kontrol) {
            System.out.println("Sifre basari ile kaydedildi");
        }


    }
}
