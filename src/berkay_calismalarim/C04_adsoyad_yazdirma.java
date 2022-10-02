package berkay_calismalarim;

import java.util.Scanner;

public class C04_adsoyad_yazdirma {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 isim 1 soyisim aliniz isimleri ustte soyisimi allta olacak sekilde yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 adinizi giriniz");

        String adSoyad = scan.nextLine();

        String ad = adSoyad.substring(0,adSoyad.lastIndexOf(" ")+1);
        String soyad = adSoyad.substring(adSoyad.lastIndexOf(" ")+1);


        System.out.println("Adiniz : "+ ad + "\nSoyadiniz : " + soyad);

        scan.close();


    }
}
