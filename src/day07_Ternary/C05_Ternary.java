package day07_Ternary;

public class C05_Ternary {
    public static void main(String[] args) {

        int sayi=11;
        // sayiyi kontrol edin sayi cift ise sayi cifttir yazin tek ise sayinin degerini 5 arttirin

        /*
        ternary isleminin sonucunu bir variable a atama yapacaksak ternary ni true ve false
        bolumlerindeki data turlerinin ayni olmasi gerekir

         sayi= sayi%2==0 ? "cift sayi" : sayi+5 ;

         yazdigimizda sayiya String bir deger atanamayacagi icin Java hata verir

         */

        System.out.println(sayi % 2 == 0 ? "cift sayi" : (sayi=sayi+ 5) );
        System.out.println("sayinin yeni degeri : " + sayi );
    }
}
