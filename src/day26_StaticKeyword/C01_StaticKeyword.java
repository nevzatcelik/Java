package day26_StaticKeyword;

public class C01_StaticKeyword {
    static int sayi=10;
    int no=20;

    public static void main(String[] args) {

        C01_StaticKeyword obj1=new C01_StaticKeyword();

        obj1.no=21;
        obj1.sayi++;

        System.out.println(obj1.no+ ", " + obj1.sayi);

        C01_StaticKeyword obj2=new C01_StaticKeyword();

        obj2.no++;
        obj2.sayi++;

        System.out.println(obj2.no+ ", " + obj2.sayi);

        C01_StaticKeyword obj3= new C01_StaticKeyword();
        obj3.no=25;
        obj3.sayi=35;

        System.out.println(obj3.no+ ", " + obj3.sayi);

    }

}

