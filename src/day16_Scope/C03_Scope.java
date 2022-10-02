package day16_Scope;

import java.util.Scanner;

public class C03_Scope {
    /*
    Static variable lar tum class ve tum objeler icin tektir.
     */

    String str="JAVA";
    int a=10;
    int b=20;

    public static void main(String[] args) {
        /*
        Variableler instance oldugundan main method icersinden direk ulasamayiz

        Static method icerisinde instance variable lara ulasmak isterseniz obje olusturup obje uzerinden
        ulasabilirsiniz

        static variable ler class uyelerinin tamami icin gecerlidir ve bir tanedir, degisirse tum class uyeleri icin
        degismis olur
        okulun ismi veya adrresi gibi

        Instance variable lar ise sadece bir objeyi ilgilendirir, degisirse sadece obje icin degisir, diger objeleri
        ilgilendirmaz
        bir ogretmenin bransi veya bir ogrencinin matematik notu gibi

         */

        Scanner scan=new Scanner(System.in);

        C03_Scope obj1=new C03_Scope();

        C03_Scope obj2=new C03_Scope();

        C03_Scope obj3=new C03_Scope();
        /*
        Bir obje olusturudumuzda Java Heap memory de o objeyi olusturur ve o objeye ozel instance variable lari
        objeye ekler

        Her hangi bir satida objeye ait instance bir deger sorulursa
        objenin olusturuldugu satira gidip objeyi o satirdan bize sorulan satira kadar takip etmeliyiz
         */

        obj1.a=11;
        obj2.a++;
        obj3.b=22;

        C03_Scope obj4=new C03_Scope();

        System.out.println(obj1.a);// 11
        obj1.a+=3;

        System.out.println(obj1.a); // 14
        System.out.println(obj2.a); //

        obj2.a+=5;
        System.out.println(obj2.a); // 16

    }
}
