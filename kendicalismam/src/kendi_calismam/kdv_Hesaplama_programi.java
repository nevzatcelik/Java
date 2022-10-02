package kendi_calismam;

import java.util.Scanner;

public class kdv_Hesaplama_programi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen KDV si hesaplanacak urunun fiyatini giriniz");
        double girilenFiyat= scan.nextDouble();
        double kdvOrani=0.18;

        double kdvHesaplama=girilenFiyat*kdvOrani;
        System.out.println("Urunun KDV si = "+kdvHesaplama);
        //KDV ciktiktan sonra kalan ucret
        double KdvsizFiyat=girilenFiyat-kdvHesaplama;
        System.out.println("Urunun KDV ciktiktan sonraki Fiyati= "+KdvsizFiyat);


    }
}