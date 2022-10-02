package calismalarsweden01;

import java.util.Scanner;

public class P03_2ad2soyad {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bilgilerinizi iki isimi tek soyisimli giriniz");

        String adSoyad=scan.nextLine();
        //  AHMET NEVZAT CELIK


        String isim=adSoyad.substring(0,adSoyad.lastIndexOf(" "));
        String soyisim=adSoyad.substring(adSoyad.lastIndexOf(" ")+1);

        System.out.println("Isminiz: " + isim +"\nSoyisminiz: " + soyisim );






    }
}
