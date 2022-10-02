package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_CharYazdırma {
    public static void main(String[] args) {
        // Kullanıcıdan bir harf alin ve alfabede o harften sonraki 3 harfi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır harf gırınız");
        char girilenHarf=scan.next().charAt(0);

        System.out.println("girilenHarf : " + girilenHarf);

        System.out.println("girilen haften bir sonraki harf : " + (char)(girilenHarf+1));
        System.out.println("girilen haften iki sonraki harf : " + (char)(girilenHarf+2));
        System.out.println("girilen haften uc sonraki harf : " + (char)(girilenHarf+3));
    }
}
