package day26_StaticKeyword.Java_Practic_AYSEhocam;

import java.util.Scanner;

public class Q8_OrtadakiHarfIyazdirma {
    public static void main(String[] args) {
        /*
      StringMethods:
      cift uzunlukta bir degiskenin ortasindaki harfi konsolda yazdirmak icin bir Java programi yaziniz.
           Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
           ORNEK:
       INPUT      :  Python
      OUTPUT :   th
   */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ortasindaki harfi yazdirmak icin bir metin giriniz");
        String metin=scan.nextLine();

        int uzunluk= metin.length();
         int tekOrta= (uzunluk-1)/2; // bu satirda ortadaki karakterin indexini uzunluk uzerinde dinamiklestiriyoruz
         int ciftOrta= uzunluk/2;

         if (uzunluk%2==0) {
             System.out.println(metin.substring(ciftOrta-1,ciftOrta+1));
         } else {
             System.out.println(metin.substring(tekOrta,tekOrta+1));

        }





    }
}
