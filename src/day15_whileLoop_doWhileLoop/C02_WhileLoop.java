package day15_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
           // iki basamakli sayilardan 7 ile bolunebilenleri while loop ile yan yana yazdirin
        int sayi=10;

        while(sayi<100) {

            if (sayi%7==0) {
                System.out.println(sayi + " ");


            }
           sayi++;

            /* while loop da baslangic degeri bitis sarti ve artim miktarini yazmaK  zorundayiz

            while loop kullanirken syntax de hata yaparsak yanlis sonuclar elde edebiliriz
             */
        }

    }
}
