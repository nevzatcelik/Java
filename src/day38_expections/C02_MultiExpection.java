package day38_expections;

import java.util.Random;

public class C02_MultiExpection {
    public static void main(String[] args) {
        /*
        Kodumuzu yazarken  expection olusma ihtimali olan bolum sayisi biden fazla ise

        expectionslarin turlerine bakilir.
        Eger expectionslar birbirleri ile ilgili degillerse
       riskli kod bloklarini ayri ayri try cath bloguna alabiliriz
       veya tek bir try birden fazla catch blogu kullanabiliriz

       expection lar birbiriyle ilintili olmadigindan
       hangisinin once yazdigimizin bir onemi yoktur

       ANCAK su nokta unutulmamalidir:
       Java try blogunu calistirirken Ilk buldugu exception da try blogunu calistirmayi durdurur.
       try blogundaki bazi kodlar calismayabilir.

        */

       String str="Java";

       int[] arr={3,4,6,8,9};

       // 0 dan 10 a kadar rastgele bir sayi uretip
        // str ve arr deki o index e sahip elementleri yazdiralim

        Random rnd=new Random();
        int rastgelesayi=rnd.nextInt(10);

        System.out.println(rastgelesayi);
        /*
        try {
            System.out.println(str.substring(rastgelesayi,rastgelesayi+1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index Stringin sinirlari disinda");

        }

        try {
            System.out.println(arr[rastgelesayi]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index array in sinirlari disinda");

        }

         */

        /* 2. ihtimal olusabilecek tum  expection lari yakalama kapasitesi olan bir expection kullaniriz
        Ancak bu durumda hatanin kaynagini net olarak bilemeyiz


        try {
            System.out.println(str.substring(rastgelesayi,rastgelesayi+1));
            System.out.println(arr[rastgelesayi]);
        } catch (Exception e) {
            System.out.println("BEKLENMEDIK BIR DURUM OLUSTU");

        }

         */
        /*
        3. ihtimal 1 tane try birden fazla catch blogu olustururuz
         */
        try {
            System.out.println(str.substring(rastgelesayi,rastgelesayi+1));
            System.out.println(arr[rastgelesayi]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Index arrayin sinirlari disinda");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index String in sinirlari disinda");
        }

    }
}
