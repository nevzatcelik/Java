package day14_methodCreation;

import java.util.Scanner;

public class C04_MethodOlusturma {
    public static void main(String[] args) {

        // input : isim : Ali soyisim: YILMAZ
        //output : Ali Yilmaz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyisminiz Giriniz");
        String soyisim= scan.nextLine();

       // SADECE YAZDIRMAK ISTERSEK
        System.out.println(isimSoyisimBirlestir(isim,soyisim));
        // KAYDETMEK ISTERSE
        String birlesmisIsim=isimSoyisimBirlestir(isim,soyisim);
        System.out.println("birlestirilmis isminiz : " + birlesmisIsim);
    }

    public static String isimSoyisimBirlestir(String isim,String soyisim) {
        String birlesmisIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " "+ soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        return birlesmisIsim;
    }
}
