package day16_Scope;

public class C04_Scope {

    static int a=10;
    int b;
    static int c;



    public static void main(String[] args) {

        C04_Scope obj1=new C04_Scope();



        System.out.println(obj1.b); // 0
        System.out.println(obj1.a);// 10-- static variabllara ulasmak icin objeye ijtiyac yoktu
        System.out.println(a);// 10
        System.out.println(obj1.c);// 0
        System.out.println(c); // 0

        obj1.b++; // 1
        obj1.a++; // 11

        C04_Scope obj2=new C04_Scope();

        System.out.println(obj2.a); // 11

        C04_Scope obj3=new C04_Scope();




    }
}
