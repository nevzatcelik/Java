package day30_accessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);

        System.out.println(sb.capacity()); // 10 verir

        System.out.println(sb.length());// 0

        sb.append("Ali Can");

        System.out.println(sb.capacity());// 10

        System.out.println(sb.length()); // 7


        sb.trimToSize(); // String buielder in fiili olarak kullanilan  boyuta yani lengthe esitler.,

        System.out.println(sb.capacity());// 7
        System.out.println(sb.length());// 7

        StringBuilder sb2=new StringBuilder("Ali Can");
        System.out.println(sb==sb2); // false

        System.out.println(sb.equals(sb2)); //false

        System.out.println(sb.compareTo(sb2));// Ali Can==> Ali Kan ve sonuc -8
        // arada hic fark yok ise sonuc 0 olur

        StringBuilder sb3=new StringBuilder("Ali Kan"); // Ali Can==> Ali Kan ve sonuc -8

        System.out.println(sb.compareTo(sb3)); // -8

        /*
        Bizim icin onemli olan 0 mi degil mi
        eger 0 sa iki String builder ayni
        eger 0 degilse iki String builder farkli
         */

    }
}
