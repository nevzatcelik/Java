package calismalarsweden01;

import java.util.Scanner;

public class P01_22_08_2022_kucukharf_buyukharf_sorusu {
    public static void main(String[] args) {

         /*"Kullanicidan bir harf isteyin, girilen karakter buyuk harf ise onu kucuk harf olarak yazdirin, " +
            "Yoksa girilen harfi yazdirin'.....

     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);

          if (girilenHarf >= 'A' && girilenHarf<='Z') {
              System.out.println((char) (girilenHarf+32));
          } else {
              System.out.println(girilenHarf);
          }

          //OKK




    }

}
