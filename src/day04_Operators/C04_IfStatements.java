package day04_Operators;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir harf alin , harf ile baslayan bir ay varsa yazdirin
        kullanici o veya O yazdiginda output Ocak olsun
        NOT= BUYUK HARF KUCUK HARF HASSASIYETI OLMASIN
         */

        /*
        O OCAK
        S SUBAT
        M MART MAYIS
        N NISAN
        H HAZIRAN
        T TEMMUZ
        A AGUSTOS'ARALIK
        E EYLUL, EKIM
        K KASIM

         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        if (harf=='O'|| harf=='o') System.out.println("aylardan Ocak");
        if (harf=='S'|| harf=='s') System.out.println("aylardan Subat");
        if (harf=='M'|| harf=='m') System.out.println("aylardan Mart veya Mayis");
        if (harf=='N'|| harf=='n') System.out.println("aylardan Nisan");
        if (harf=='H'|| harf=='h') System.out.println("aylardan Haziran");
        if (harf=='T'|| harf=='t') System.out.println("aylardan Temmuz");
        if (harf=='A'|| harf=='a') System.out.println("aylardan Agustos veya Aralik");
        if (harf=='E'|| harf=='e') System.out.println("aylardan Eylul veya Ekim");
        if (harf=='K'|| harf=='k') System.out.println("aylardan Kasim");










    }
}
