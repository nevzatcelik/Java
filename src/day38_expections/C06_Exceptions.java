package day38_expections;

public class C06_Exceptions {
    public static void main(String[] args) {
        // 4- NumberFormatException
        // Pars Integer kullandigimizda String de sayi disinda bir karakter olusa bununla karsilasiriz
        // orn "56a" olursa
    String str="567";

        System.out.println(Integer.parseInt(str) +3); // NumberFormatException

        // 5- ClassCastException uygun olmayan cast islemlerinde ortaya cikar
        String a="Java";


        // Integer b=a; farkli data turlerindeki variable'lari birbirine atayamayiz

        Object b=a; // Object class i Sting in parent classi oldugundan kabul eder

        Integer c=(Integer) b; // Object class i iNTEGER in da parent i oldugundan casting ile kabul etti
        System.out.println(c);

    }
}
