package day36_polymorphism;

public class C02_Overriding extends C01_Overloading{

    public static void main(String[] args) {
        /*
        Overriding parents class daki bir methodu child class a uyarlamak icin kullanilir

        Overiding yapmak icin parent class daki method ile child class daki methodun signature lari
        AYNI OLMALIDIR!!
        Child class a uyarlamayi method body sinde yapariz

        Signature farkli olursa bu iki method overriden / overriding method olmaz farkli iki method olur
         */
        C02_Overriding obj=new C02_Overriding();
        obj.islem(4,5); // 20
        obj.islem("Veli","Cem"); //Veli
        obj.islem("Hasan",4); // Hasan

        C01_Overloading obj2=new C02_Overriding();
        obj2.islem(5,6.4); // 32
        obj2.islem(5,"Ali");  // 5 Ali

        C01_Overloading obj3=new C01_Overloading();
        obj3.islem(5,6); // 11
        obj3.islem(5,"Ali"); // 5 Ali


    }

 public void islem(double a,double b) {
     System.out.println(a*b);
 }

 public void islem(String c,int d){
     System.out.println(c);
 }

}
