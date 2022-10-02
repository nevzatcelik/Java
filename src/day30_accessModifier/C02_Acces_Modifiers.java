package day30_accessModifier;

public class C02_Acces_Modifiers {

    /*
    Bir class uyesi olusturuldugunda access modifier yazilmasi MECBURIDIR
    eger bir class uyesi olusturulurken access modifier yazmasak
    Java ona default access modifier degeri atar
    Default access modifier gorunur olarak yazilamaz
    sadece biz bir access modifier yazmazsak javanin otomatik olarak atamasi mumkundur

    -class level da variable iicin default deger
   - default constructor
   - switch-case de caslere uymazsa default deger vardi
   - ve simdi de default access modifier
     */


    int sayi; // sayinin default degeri=0
    static String str="JAVA";

    void method1(){

    }
}
