package day16_Scope;

public class C02_Scope {
    /*
        tum class da gecerli olmasini istedigimiz variable lari class level de olustururuz

        Class level da 2 tur variable olusturabiliriz
        1-Static variable (Class variables) -- Static olan
        2-Instance variables (Object variables) -- Static olmayan

        KURAL 1* Static variable lar class icerisinde her yerden kullanilabilir
                  Intance varriable lar static methodlardan kullanilamaz
        KURAL 2* Static veya Instance variablelara deger atama zorunlulugu yoktur
        Class level variable lara biz degerr atamazsak java onlara tanimlanan default degerleri atama yapar
        Bu default degerler
        satisal veriable icin 0
        char variable icin hiclik
        boolean icin false
        String null dir
     */
    static int sayi=10;
    static boolean olduMu;
    static int a;
    static char b;
   static String str2;
    String str="Java";
    char krkter;


    public static void main(String[] args) {
        System.out.println(sayi);
      //  System.out.println(str);
        System.out.println(olduMu); // false
        System.out.println(a); // 0
        System.out.println(b); // hiclik
        System.out.println(str2); // null

    }

    public static void digerMethod(){
        System.out.println(sayi);
      //  System.out.println(str);

    }

    public void staticOlmayanMethod (){
        System.out.println(sayi); // 10
        System.out.println(str); // java
        System.out.println(krkter); // hiclik

    }

}
