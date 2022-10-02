package day36_polymorphism;

public class C01_Overloading {

    public static void main(String[] args) {
        C01_Overloading obj=new C01_Overloading();
        obj.islem(3,"Java"); // 3 Java
        obj.islem("Ali","Can"); // Ali
        obj.islem("Hava",5); //  5
        obj.islem(5,6);// 5.0 6.0
        obj.islem(3.2,5.6); // 3.2 5.6
        /*
        overloading : Ayni class da ayni isim ama fakli signature a sahip methodlar olustumaktir

        signature : isim,parametre sayisi ve parametre data turu siralanisi
        overloading icin isim ayni olmak zorundadir,
        geriye parametre sayisi veya data turu fakli olan parametrelerin sirlanaisini degistirmek kaliyor
         */

    }

    public  void islem(double a, double b) {
        System.out.println(a+b);
    }

    public  void islem(String a, int b) {
        System.out.println(b);
    }

    public  void islem(String a, String b) {
        System.out.println(a);
    }

    public  void islem(int a,String b){
        System.out.println(a + " " + b);

    }
}
