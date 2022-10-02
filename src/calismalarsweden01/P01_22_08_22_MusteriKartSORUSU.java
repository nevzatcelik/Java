package calismalarsweden01;

import java.util.Scanner;

public class P01_22_08_22_MusteriKartSORUSU {
    public static void main(String[] args) {
          /*
        Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun.
        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Toplam indirim miktari ve odenecek tutari yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urunun adetini \nVe fiyatini giriniz");
        int adet = scan.nextInt();
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri karti varsa E yoksa H tusuna basiniz");
        char kart = scan.next().toUpperCase().charAt(0);
        // iskeleti Musteri Karti olup olmamasina gore kuralim
        double tst = adet * listeFiyati;
        //tst=TOPLAM SATIS TUTARI
        double yapilanIndirimTL = 0;
        double odenecekPara = 0;
        if (kart=='E') { // Musteri Karti Blogu
            if (adet > 10) { // % 20 indirim
                System.out.println("Liste fiyatindan satis tutari: " + tst +
                        "\nSize yaptigimiz indirim tutari: " + tst * 20 / 100 +
                        "\nOdeyeceginiz tutar: " + (tst - tst * 20 / 100));
            } else { // % 15 indirim
                System.out.println("Liste fiyatindan satis tutari: " + tst +
                        "\nSize yaptigimiz indirim tutari: " + tst * 15 / 100 +
                        "\nOdeyeceginiz tutar: " + (tst - tst * 15 / 100));
            }
        } else if (kart=='H') { // Musteri Kartsiz Blok
            if (adet > 10) { // % 15 indirim
                System.out.println("Liste fiyatindan satis tutari: " + tst +
                        "\nSize yaptigimiz indirim tutari: " + tst * 15 / 100 +
                        "\nOdeyeceginiz tutar: " + (tst - tst * 15 / 100));
            } else { // % 10 indirim
                System.out.println("Liste fiyatindan satis tutari: " + tst +
                        "\nSize yaptigimiz indirim tutari: " + tst * 10 / 100 +
                        "\nOdeyeceginiz tutar: " + (tst - tst * 10 / 100));
            }
        } else {
            System.out.println("Kart bigisi gecersiz");
        }
    }
}
