package calismalarsweden01;

import java.util.Scanner;

public class P01_22_08_2022_bolunebilen_sorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");
        } if (girilenSayi %5 == 0) {
            System.out.println("Bes ile bolunebilen sayi");
        } else {
            System.out.println("Girilen sayi 3 veya 5 e bolunemeyen bir sayi");
        }
    }
}