package day03_matematikselislemler_Increment;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        /* kullanicidan 4 basamakli pozitif bir tam sayi alip rakamlar toplamini bulalim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanicidan 4 basamakli pozitif bir tam sayi alin");
        int girilenSayi= scan.nextInt(); // ornegin 1469 olsun
        /* bu soruyu ilerde loop ile yapacagiz ama simdilik ayni islemi basamak sayisi kadar kendimiz
        tekrar ettirecegiz

        2- java da bir kod yazmaya baslamadan once
         algoritmayi tasarlayip ihtiyacimiz olan variablelari
        olusturmaliyiz
         */
        int birlerbasamagi=0;
        int rakamlarToplami=0;

        // sayi : 1469 , birlerBasamagi=0 , rakamlar toplami=0

        birlerbasamagi=girilenSayi%10; // 9
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 0+9=9
        girilenSayi=girilenSayi/10; // 146 kaldi

        //  sayi : 146 , birlerBasamagi=9 , rakamlar toplami=9
        birlerbasamagi=girilenSayi%10; // 6
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 6+9=15
        girilenSayi=girilenSayi/10; // 14 kaldi

        //  sayi : 14 , birlerBasamagi=6 , rakamlar toplami=15

        birlerbasamagi=girilenSayi%10; // 4
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 6+9+4=19
        girilenSayi=girilenSayi/10; // 1 kaldi

        //  sayi : 1 , birlerBasamagi=4 , rakamlar toplami=19

        birlerbasamagi=girilenSayi%10; // 1
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 6+9+4+1=20
        girilenSayi=girilenSayi/10; // 0,1==> 0

        System.out.println("Girilem sayinin rakamlar toplami" + rakamlarToplami);

















    }
}
