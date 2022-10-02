package day13_ForLoops_nestedForLoop;

import java.util.Scanner;

public class C03_AsalsayiKontrol {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi alip asal sayi olup olmadigini kontrol edin
         asal sayi: kendisi ve 1 disinda hic bir pozitif tam sayiya bolunmeyen sayilara denir

         For loop un herhangi bir durumda calismayi durdurmasini istiyorsak break; kullanabiliriz
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
       int sayi= scan.nextInt();

       boolean flagAsalMi=true;


        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0) {
                System.out.println("Girdiginiz sayi asal sayi degildir");
                flagAsalMi=false;
                break;

            }

        }
        // burada nasil bir sonuc yazilmali
        // asal iken mi? degilken mi?

        if (flagAsalMi=true) {
            System.out.println("Girdiginiz sayi asal sayi");
        }
    }
}
