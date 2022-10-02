package day12_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        // KULLANICIDAN POZITIF BIR SAYI ALIP SAYININ RAKAMLAR TOPLAMINI YAZDIRIN

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int sayi= scan.nextInt(); // 12657 girsin orn.
        int ilkGirilenSayi=sayi;

        // islemin kac kere tekrar edilecegini bulmak icin basamak sayisina ihtiyacim var

        String sayiStr=sayi+"";
        int basSayisi= sayiStr.length();


        int birlerBas=0;
        int rakamlarTop=0;

        for (int i = 1; i <=basSayisi ; i++) {
            birlerBas=sayi%10;             // birler basamagini verir
            rakamlarTop+=birlerBas;        // birler basamagini rakamlar toplamina ekler
            sayi=sayi/10;                 // isimizin bittigi birler basamagini yok eder


        }
        System.out.println("Rakamlar toplami : " + rakamlarTop);

    }
}
