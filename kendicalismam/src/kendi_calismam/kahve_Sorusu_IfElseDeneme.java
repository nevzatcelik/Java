package kendi_calismam;

import java.util.Scanner;

public class kahve_Sorusu_IfElseDeneme {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("                 Merhaba, Ne icmek istersiniz?              ");
        System.out.println("A-Türk kahvesi " + " B-Filtre Kahve " + " C-Espresso " + " D-Latte " + " E-Sicak Cikolata ");

        System.out.print("Lütfen Tercihinizi yapin: ");
        Scanner scanner = new Scanner(System.in);
        String kahveTercihi = scanner.nextLine().toUpperCase();


        if (!(kahveTercihi.equals("A") || kahveTercihi.equals("B") || kahveTercihi.equals("C") ||
                kahveTercihi.equals("D") || kahveTercihi.equals("E"))) {
            System.out.println("Hatali tuslama yaptiniz");


        } else {


//----------------------------------------- TODO 1. Koşul Bölümü -------------------------------------------//
//***************************************** Ustte Kahve Tercih Satiri *********************************************//

            System.out.println("Süt eklememizi ister misiniz ?" + "\nEVET:     HAYIR: ");
            String sutSecimi = scanner.nextLine().toUpperCase();
            char ch=sutSecimi.toUpperCase().charAt(0);

            if (sutSecimi.equals("E")) {
                sutSecimi = " Sütlü";
                System.out.println("Süt ekleniyor...\n");
                Thread.sleep(2000);
            } else if (sutSecimi.equals("H")) {
                sutSecimi = " Sade";
                Thread.sleep(1000);
                System.out.println("Süt eklenmeyecek...\n");


            } else {
                System.out.println("Hatali tuslama yaptiniz,Lutfen seceneginizi E ya da H olarak giriniz\n");

                return;
            }


//----------------------------------------- TODO 2. Koşul Bölümü -------------------------------------------//
//***************************************** Üstte Süt Tercihi Satiri ***********************************************//

            System.out.println("Seker eklemek ister misiniz ?" + "\nEVET:     HAYIR: ");
            String sekerSecimi = scanner.nextLine().toUpperCase();


            if (sekerSecimi.equals("E")) {
                System.out.println("Lütfen seker miktarini Kup seker adedi olarak giriniz");
                int sekerMiktari;


                while (!scanner.hasNextInt()) {
                    System.out.println("Hatali tuslama yaptiniz.");
                    System.out.println("Lütfen seker miktarini sayi olarak giriniz");
                    scanner.nextLine();
                }
                sekerMiktari = scanner.nextInt();


                System.out.println(sekerMiktari + " adet Kup seker ekleniyor...\n");
                sekerSecimi = sekerMiktari + " adet kup Sekerli";
                Thread.sleep(2000);
                String bosKod = scanner.nextLine();
            } else if (sekerSecimi.equals("H")) {
                Thread.sleep(1000);
                System.out.println("Seker eklenmeyecek...\n");
                sekerSecimi = "Sekersiz ";
            } else {
                System.out.println("Hatali tuslama yaptiniz.\n");

                return;
            }


//----------------------------------------- TODO 3. Koşul Bölümü -------------------------------------------//
//***************************************** Üstte Seker Tercihi Satiri *************************************//


            System.out.println("                   Lütfen Bardak Boyutunu Seciniz                 ");
            System.out.println("B- Büyük Boy " + " O- Orta Boy " + " K- Kücük Boy");
            String bBoy = "Büyük boy";
            String oBoy = "Orta boy";
            String kBoy = "Kücük boy";
            String bardakSecimi = scanner.nextLine().toUpperCase();
            if (bardakSecimi.equals("B")) {
                System.out.println("Buyuk boy");
                Thread.sleep(500);
                bardakSecimi = bBoy;
            } else if (bardakSecimi.equals("O")) {
                System.out.println("Orta boy");
                Thread.sleep(500);
                bardakSecimi = oBoy;
            } else if (bardakSecimi.equals("K")) {
                System.out.println("Kucuk Boy");
                Thread.sleep(500);
                bardakSecimi = kBoy;
            } else {
                System.out.println("Hatali tuslama yaptiniz");

            }

//----------------------------------------- TODO 4. Koşul Bölümü -------------------------------------------//
//***************************************** Bardak Boyutu Tercihi Satiri *************************************//
            if (kahveTercihi.equals("A")) {
                System.out.println(sekerSecimi + sutSecimi + " Türk Kahveniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Türk kahveniz hazır, Afiyet olsun !!!");
            } else if (kahveTercihi.equals("B")) {


                System.out.println(sekerSecimi + sutSecimi + " Filtre Kahveniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Filtre kahveniz hazır, Afiyet olsun !!!");
            } else if (kahveTercihi.equals("C")) {
                System.out.println(sekerSecimi + sutSecimi + " Espressonuz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Espressonuz hazır, Afiyet olsun !!!");
            } else if (kahveTercihi.equals("D")) {

                System.out.println(sekerSecimi + sutSecimi + " Latteniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Latteniz hazır, Afiyet olsun !!!");
            } else if (kahveTercihi.equals("E")) {
                System.out.println(sekerSecimi + sutSecimi + " Sicak Cikolataniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Sicak Cikolataniz hazır, Afiyet olsun !!!");
            } else {
                System.out.println("Hatali tuslama yaptiniz");
            }


         }


        }
    }

