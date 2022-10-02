package berkay_calismalarim;

import java.util.Scanner;

public class C03_kucukbuyukHarfSorusu {
    public static void main(String[] args) {

        /*
        Klavyeden okunan bir karakterin (char) küçük harf olduğunun kontrolünü yaparak,
        bu harfin büyük harf karşılığını ekrana yazdıran programı Java dilinde yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN BIR KUCUK HARF GIRINIZ");
        char harf=scan.next().charAt(0);


        if ( harf >= 'a' && harf <= 'z') {
            System.out.println((char) (harf-32) );
        }else {
            System.out.println(harf);
        }

      // Ternary cozum  System.out.println(harf >= 'a' && harf <= 'z' ? (char) (harf - 32) : harf);

    }
}
