package kendi_calismam;

import java.util.Scanner;

public class calismam1 {
    public static void main(String[] args) {
        /*Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini
        yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='A' && girilenKarakter<='Z') {
            System.out.println("Girilen karakter buyuk harftir");
        }else if (!(girilenKarakter>='A' && girilenKarakter<='Z')){
            System.out.println("girilen karakter buyuk harf degildir");
        }else {
            System.out.println("Girilen karakter harf degildir");
        }


    }
}
