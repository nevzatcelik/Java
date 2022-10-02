package day07_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        sayi = sayi>0 ? sayi : -1* sayi;

        System.out.println("Girilen sayinin mutlak degeri " + sayi);
    }
}
