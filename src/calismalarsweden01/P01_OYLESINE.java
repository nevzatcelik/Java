package calismalarsweden01;

import java.util.Scanner;

public class P01_OYLESINE {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,

        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        if (girilenSayi %3 ==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
        if (girilenSayi %5 ==0){
            System.out.println("Bes ile bolunebilen sayi");
        }

    }

}
