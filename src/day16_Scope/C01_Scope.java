package day16_Scope;

public class C01_Scope {
    // Class level demek class in icinde ama tum methodlarin disinda demektir

    static int s1=12;
    public static void main(String[] args) {
        /*
            Java da scope hangi variable in nereden kullanilabilecegini ya da hangi satida hangi variable lari
            kullanabilecegimizi belirleyen kurallardir

            bir variable nin scope undan bahsedersek
            o variable nin nerelerde kullanilabilecegini konusmamiz gerekir

            bir method icin scope tan bahsedersek
            o method icerisinde kullanilabilecek variable lardan bahsederiz
            1-Bir methodun icerisinde olusturulan variable baska bir methodda direk kullanilamaz

           Bu durumda class icerisinde tum merhodlar'dan kullanilmasini istedigimiz varibale lari class
           level da olustururuz
         */
        int sayi=10;
       // System.out.println(str);
        System.out.println(s1);

    }

    public static void digerMethod(){
        //System.out.println();
        String str="java";
        System.out.println(s1);

    }


}
