package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // soru:7 kullanıcıdan iki sayı alıp ikisinin degerini degiştirin(swap)


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1.tamsayıyı giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Lutfen 2.tamsayıyı giriniz");
        int sayı2= scan.nextInt();

        System.out.println("girilen degerler sayı1,:"+sayı1+ " sayı 2 : "+ sayı2);

        int sayı3;

        sayı3=sayı2; // sayi 2 oldu

        sayı2=sayı1;// sayi 1 oldu

        sayı1=sayı3;// sayi 3 oldu

        System.out.println("degısımden sonra sayı1, : "+sayı1+ "sayı2 : "+ sayı2);
        System.out.println(sayı3);
    }
}
