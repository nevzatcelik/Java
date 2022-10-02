package day08_switchStatments_StringManipulations;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi alin
        Sayi pozitif ise cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        Sayi pozitif degilse 3 basamakli veya 3 basamakli degil yazdirin seceneklerinden uygun olani
        yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

       String sonuc = sayi>0 ? (sayi %2==0 ? "Cift Sayi" : "Cift Sayi Degil") : // SART DOGRU ISE CALISACAK KOD
                  (sayi<=-100  && sayi>=-999 ? "3 basamakli" : "3 basamakli degil") ;// sart dogru degilse

        System.out.println(sonuc);
    }
}
