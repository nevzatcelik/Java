package day26_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        C01_StaticKeyword obj1= new C01_StaticKeyword();
        System.out.println(obj1.no+ ", " + obj1.sayi); // 10, 20

        obj1.no=25;
        obj1.sayi=30;

        C01_StaticKeyword obj2= new C01_StaticKeyword();

        obj2.no++;
        obj2.sayi++;
        System.out.println(obj2.no+ ", " + obj2.sayi); // 21,31

        obj2.no=40;
        obj2.sayi++;

        C01_StaticKeyword obj3= new C01_StaticKeyword();
        System.out.println(obj1.no+ ", " + obj1.sayi); //
        System.out.println(obj2.no+ ", " + obj2.sayi); //
        System.out.println(obj3.no+ ", " + obj3.sayi); //


    }
}
