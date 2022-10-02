package day39;

public class C02_Final {

   final static int OKUL=111;

    public static void main(String[] args) {
        /*
        final keyword variable, method ve class icin kullanilir.
        variable final olarak tanimlanirsa,o variable a sonradan deger atanamaz.

        method final olarak tanimlanisa override edilemez.

        class final olarak tanimlanirsa parent ilan edilemez

        Finnaly blogu ; try blogu ile kullanilir, exception olussa da olusmasa da calisir

        Fanilaze (); Garbage collector un calismasi icin on hazirlik yaparak kullanilmayan objeleri toparlar

         */

        final int sayi=10;

        System.out.println(sayi);

        System.out.println(Integer.MAX_VALUE);

    }
    public static final void method1(){

    }
}
