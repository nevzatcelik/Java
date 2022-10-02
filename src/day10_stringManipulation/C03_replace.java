package day10_stringManipulation;

public class C03_replace {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.replace('J', 'j'));


        System.out.println(str); // java ogren isi kap

        str= str.replace("isi","offer'i"); // string deki degisikligin kalici olmasi icin
                                                         // atama yapmaliyiz

        System.out.println(str);

        System.out.println(str.replace("a","e")); // Jeve ogren offer'i kep
         // replace methodu sarta uyan tum parcalari degistirir

        System.out.println(str.replace("ogren","k"));
        System.out.println(str.replace("a","aaaa"));

        // tum a harflerini silmek istesem

        System.out.println(str.replace("a","")); // Jv ogren offer i kp

        // olmayan bir metni degistirmek istersek
        System.out.println(str.replace("Kemal","ali")); // Java ogren, offer'i kap



    }
}
