package day26_StaticKeyword;

import javax.crypto.spec.PSource;

public class C03_StaticKeyword {
    public static void main(String[] args) {

        // hic obje olusturmadan c01 deki static veriable lari kullanabiliriz

        System.out.println(C01_StaticKeyword.sayi); // 10

        C01_StaticKeyword.sayi=20;
        System.out.println(C01_StaticKeyword.sayi); // 20

       C01_StaticKeyword obj=new C01_StaticKeyword();

        System.out.println(obj.no+", "+ obj.sayi); // 20,20
        /*
        Static variable lar class a aittir ve class ile birlikte olusturulur. hic obje olusturmasak da static variable
        lar kullanilabilir veya udate edilebilir

        19.satirda instance no variable nin degerini bulmak icin objenin olusturuldugu 17.satirdan sonrasini inceleriz

        ANCAk 19. satirda static variable in degerini gormek icin class in basindan itibaren 19. satira kadar static
        variable yi takip etmeliyiz

         */

    }

}
