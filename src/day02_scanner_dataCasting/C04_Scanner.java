package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Telefon Numaraniz :
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);

        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("lutfen soyısmınızı giriniz");
        String soyisim=scan.nextLine();

        System.out.println("lutfen yasınızı giriniz");
        int yas=scan.nextInt();

        System.out.println("Lutfen Telefon Numaranizi Giriniz");
        String girilenNo=scan.next();

        System.out.println("Ismınız: " +isim+"\nSoyisminiz : "+ soyisim + "\nYasınız : " + yas+ "\nTelefon Numaraniz :"+
                girilenNo + "\nKaydınız basarıyla tamamlanmıstır." );

        // String ile scan.next() ve scan.nextLine() kullanilabilir
        // next() sadece ilk space e kadar olan kısmı alırken nexLine() tum satırı alır.
        // arka arkadaya birden fazla string degeri kullanıcısından alınacaksa hata olmamais icin
        // nextLine() kullanilmasi daha iyi olur





    }
}
