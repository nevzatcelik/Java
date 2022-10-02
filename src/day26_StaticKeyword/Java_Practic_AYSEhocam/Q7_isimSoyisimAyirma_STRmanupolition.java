package day26_StaticKeyword.Java_Practic_AYSEhocam;

import java.util.Scanner;

public class Q7_isimSoyisimAyirma_STRmanupolition {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir isim ve soy isim giriniz");

        String adSoyad=scan.nextLine();

        // Levent OZKUL

        String ad = adSoyad.substring(0,adSoyad.indexOf(" ")); // Levent
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1); // ozkul

        System.out.println("ad : " + ad + "\nSoyad : "+ soyad);









    }
}
