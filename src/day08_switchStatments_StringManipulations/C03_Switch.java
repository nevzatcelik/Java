package day08_switchStatments_StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        /*
        Kullinicidan gun ismini alin
        ve girilen gun ismine gore
        hafta ici veya hafta sonu olarak yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz ");
        String gunIsmi= scan.next();
        String gunIsmiKontrolIcin= gunIsmi.toLowerCase();

        /*
        String ifadeler case-sensitive dir (buyuk kucuk harf duyarlidir)
        Pazartesi, pazartesi,PAZARTESI,PAzartesi...... hep farkli s

        Kullanicin girdigi degeri kodumuzu dogru calistirmak ve dogru sonuclara ulasmak icin degistirebil-
        iriz. ama bu durumda kullanicin girdigi deger degismis ve kaybolmus olur

        Kullanicinin girdigi degeri korumak icinn ikinci bir variable olusturup kodlarimizda ikinci bir vari-
        able kullanmak degistirmek daha uygun olur
         */

        boolean tatilMi=false;

        switch (gunIsmiKontrolIcin){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case"persembe" :
            case "cuma" :
                System.out.println("hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("hafta Sonu");
                break;
            default:
                System.out.println("GECERSIZ GUN ISMI");

        }



    }
}
