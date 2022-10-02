package day07_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip  5 e bolunuyorsa "sayi 5 in tam kati yazdirin"

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi % 5 == 0 ? "Sayi 5'in tam kati" : "Sayi 5'in tam kati degil");

    }
}
