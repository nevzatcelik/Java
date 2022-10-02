package berkay_calismalarim;

import java.util.Scanner;

public class C06_2ad2soyadKullanicidan {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lUTFEN ISMINIZI GIRINIZ");
        String ad=scan.nextLine();
        System.out.println("LUTFEN SOYISMINIZI GIRINIZ");
        String soyAd=scan.nextLine();


        System.out.println("ismini : " + ad + "\nsoyadiniz: "+soyAd);

        scan.close();



        /* String ad=adsoyad.substring(0,adsoyad.indexOf(" "));
        String soyad=adsoyad.substring(adsoyad.lastIndexOf(" "));
        System.out.println("isminiz: "+ad+"\nsoyadiniz: "+soyad);

        */


    }
}
