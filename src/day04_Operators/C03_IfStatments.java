package day04_Operators;

import java.util.Scanner;

public class C03_IfStatments {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin
        // sayıyı kontrol edip 5 ile bolunebiliyorsa "sayı 5 in tam katı" yazdırın


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozıtıf bır tam sayı gırınız");

        int girilenSayi= scan.nextInt();

        if(girilenSayi % 5==0 ){
            System.out.println("sayi 5 ile tam bolunuyor");
        }



    }
}
