package day07_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        /*
        Kullancidan bir sayi isteyin Kullanicinin girdigi sayiyi kontrol edip sayif cift sayi ise 2 ile
        carpin tek sayi ise 10 ile toplayin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scanner.nextInt();

        sayi= sayi%2==0 ? 2*sayi  : sayi+10 ;

        System.out.println("girdiginiz sayiyi degistirdik ,yeni deger :" + sayi );


    }
}
