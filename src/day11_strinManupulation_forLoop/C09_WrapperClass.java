package day11_strinManupulation_forLoop;

public class C09_WrapperClass {
    public static void main(String[] args) {

        /*
        String non primitive oldugundan bir cok faydali hazir methodu oldugunu gorduk
        primitive data turlerinin hazir methodlari olmaz

        java bu eksikligi gidermek icin primitive data turlerinin her birine ozel Wrapper Class
        hazirlamistir.
        Bu classlarda o data turu icin kullanabilecegimiz bazi hazir methodlar olusturmustur.
         */

        String str= "Java muhtesem";

        int sayi=10;
        Integer sayiW= 20;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(34, 465));


        boolean kontrol=true;
        Boolean kont=false;
        String knt="false";
      boolean sonuc=Boolean.valueOf(kont);



        char chr='*';
        Character ch='p';
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.getType('a'));
        System.out.println(Character.isAlphabetic('s'));


    }
}
