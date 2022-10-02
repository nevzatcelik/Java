package berkay_calismalarim;

import java.util.Scanner;

public class C02_ifElseSORUSU {
    public static void main(String[] args) {
        /*Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak şekilde programı yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir boy uzunlugu girin");
        double boy= scan.nextDouble();

        if (boy<=175) {
            System.out.println("KISA BOYLUSUNUZ");
       } else if (boy>175 && boy<200){
            System.out.println("UZUN BOYLUSUNUZ");

        } else {
            System.out.println("INSAN DEGILSIN KARDESIM");
        }

    }
}
