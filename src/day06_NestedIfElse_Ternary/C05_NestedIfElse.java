package day06_NestedIfElse_Ternary;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {

        /*
        Kullanicidan aldigi urun adedi ve liste fiyati alin,
        kullaniciya musteri karti olup olmadigini sorun.
        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 inidirim yapin
        Musteri karti yoksa 10 urunden fazla alirsa  %15 yoksa %10 indirim yapin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urunun adedini \nVe fiyatini giriniz");
        int adet = scan.nextInt();
        double listeFiyati = scan.nextDouble();

        System.out.println("Musteri karti varsa E, yoksa H tusuna basiniz");
        char kart = scan.next().toUpperCase().charAt(0);

         // ALDIGI URUN SAYISINA GORE ANA ISKELETI KURALIM
        double toplamsatistutari=adet*listeFiyati;
        double yapilanindirimTl=0;
        double odenecekpara=0;

        if (adet>10) {
           if (kart=='E') { // %20

               System.out.println("Liste fiyatindan satis tutari :" + toplamsatistutari +
                       "\nsize yaptigimiz indirim tutari : " + toplamsatistutari*20/100 +
                       "\nodeyeceginiz tutar : " + (toplamsatistutari-toplamsatistutari*20/100));

           } else if (kart=='H'){ // %15
               System.out.println("Liste fiyatindan satis tutari :" + toplamsatistutari +
                       "\nsize yaptigimiz indirim tutari : " + toplamsatistutari*15/100 +
                       "\nodeyeceginiz tutar : " + (toplamsatistutari-toplamsatistutari*15/100));
           }else {
               System.out.println("Kart bilgisi gecerciz");
           }

        } else{ // adet 10 dan fazla degilse

            if (kart=='E') { // %15

                System.out.println("Liste fiyatindan satis tutari :" + toplamsatistutari +
                        "\nsize yaptigimiz indirim tutari : " + toplamsatistutari*15/100 +
                        "\nodeyeceginiz tutar : " + (toplamsatistutari-toplamsatistutari*15/100));

            } else if (kart=='H') { // %15
                System.out.println("Liste fiyatindan satis tutari :" + toplamsatistutari +
                        "\nsize yaptigimiz indirim tutari : " + toplamsatistutari*10/100 +
                        "\nodeyeceginiz tutar : " + (toplamsatistutari-toplamsatistutari*10/100));
            }else {
                System.out.println("Kart bilgisi gecersiz");
            }


        }



    }
}
