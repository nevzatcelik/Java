package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alıp sayının kupunu yazdıralım
        // 1.adım- Scanner objesi oluşturmak
        Scanner scan = new Scanner(System.in);
        // 2.adım- kullanıcıdan ne istediğimizi kullanıcya söyleyelim
        System.out.println("lutfen bir tamsayı giriniz");
        // 3.adım- Istedıgımız datayı koyabılecegımız bir variable oluşturup kullanıcının girdigi degeri
        // uygun methodla alalım ve oluşturdugumuz variable a atayalım.

        int girilenSayi= scan.nextInt();
        System.out.println("girdiğiniz sayının kupu : "+(girilenSayi*girilenSayi*girilenSayi));






    }
}
