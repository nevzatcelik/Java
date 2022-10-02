package day14_methodCreation;

public class C05_MethodOlusturma {
    public static void main(String[] args) {

        /*
        verilen sayilari carpim methodunda carpmak ve sonucu dondurmek istiyoruz

        kullanici 2,3 veya 4 parametre girdiginde girilen tum sayilari carpip sonucu
        bize donduren ayni isimde 3 farkli method olusturun
         */

     //iki sayisinin carpimini yazdiralim
        System.out.println(carpim(3.4,2.3));
     // uc sayinin carpimi
        System.out.println(carpim(2.3,4.5,5.6));
        // dort sayinin carpimi
        System.out.println(carpim(2.3,3.4,4.5,5.6));

        /*
        Bir class da ayni isimde ama farkli methodlar olusturulabilir
         bunun icin ya farkli sayida parametre kullanilmali veya parametrelerin data turleri degistirilmeli
         buna Java da OVERLOADING denir

         Ayni isim ve ayni sayida parametresi olan methodlardan hangisini kullanacagina karar verirken
         tum methodlari inceler
         100% uyumlu olursa onu kullanir
         100% uyumlu yoksa calisabilecek olanlardan en az casting ile calisacak olani tercih eder
         */

        /*
        method call da yazdigimiz degerlere argument diyoruz
        method da kullanilan degiskenlere ise parametre denir
        Siz bir method kol yaptiginizda Java argument'lerle parametrelerin uyumunu kontrol eder
        Uuyumluysa calistirir yoksa CTE verir
         */



    }
    public static double carpim(double sayi1, double sayi2) {
        return sayi1*sayi2;

    }

    public static double carpim(double sayi1, double sayi2 , double sayi3) {
        return sayi1*sayi2*sayi3;
    }
    public static double carpim(double sayi1, double sayi2 , double sayi3, double sayi4) {
        return sayi1*sayi2*sayi3*sayi4;
    }
}
