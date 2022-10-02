package kendi_calismam;

import java.util.Scanner;

public class HesapMakinasiOtomasyon {
    public static void main(String[] args) {
        // Kullanicidan alinan degerler ile bir hesap makinasi otomasyonu kuralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz secenegi secini\n"+
                "1-TOPLAMA\n"+
                "2-CIKARMA\n"+
                "3-CARPMA\n"+
                "4-BOLME");

          String yapilacakIslem=scan.nextLine();
          if (!(yapilacakIslem.contains("1")) && (!(yapilacakIslem.contains("2"))) && (!(yapilacakIslem.contains("3"))) &&
                  (!(yapilacakIslem.contains("4")))) {
              System.out.println("Hatali Tuslama Yaptiniz");

          }else {


              System.out.println("Lutfen islem yapmak icin bir sayi giriniz");
              double girilenSayi1 = scan.nextDouble();
              System.out.println("Lutfen islemini yapmak istediginiz 2.sayiyi giriniz");
              double girilenSayi2 = scan.nextDouble();

              if (yapilacakIslem.contains("1")) {
                  System.out.println("Isleminizin Sonucu = " + (girilenSayi1 + girilenSayi2));
              }
              if (yapilacakIslem.contains("2")) {
                  System.out.println("Isleminiz Sonucu= " + (girilenSayi1 - girilenSayi2));
              }
              if (yapilacakIslem.contains("3")) {
                  System.out.println("Isleminizin Sonucu= " + (girilenSayi1 * girilenSayi2));
              }
              if (yapilacakIslem.contains("4")) {
                  System.out.println("Isleminizin Sonucu= " + (girilenSayi1 / girilenSayi2));
              }

          }

    }
}
