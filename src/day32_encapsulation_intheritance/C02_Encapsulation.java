package day32_encapsulation_intheritance;

public class C02_Encapsulation {
    public static void main(String[] args) {

        C01 obj=new C01();
        System.out.println(obj.getYas()); //

        obj.setYas(-20); //negatif sayi giremezsin

        System.out.println("yas : "+obj.getYas()); // -20

        /*
        biz bir objeye deger atamasini kontol edemeyiz.
        Kullanici kac degerini atarsa java o degeri kullanir

        Encapsulation un faydalarindan biri de bu deger atamasini getter veya setter methodlarinda kontrol edebilmek
        tir
         */
        System.out.println(C01.getHastaneAdi());
           // C01.hastaneAdi="Gicik Hastahane";
            //Static olmasinin soyle bir sikintisi var bir baska kisiler baska sayfadan ggetrime islemini
        //static oldugu icin degistirebilir
    }
}
