package day08_switchStatments_StringManipulations;

public class C11_length {
    public static void main(String[] args) {
        /*
       length methodu bize Stringin kac karakterden olustugunu(uzunluk) bize dondurur
         */

        String str= " Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); //35

        // bu stringin son karakterini yazdirin??

        System.out.println(str.charAt(str.length()-1)); // u

        // sondan 3. karakteri yadirin

        System.out.println(str.charAt(str.length()-3)); // g


    }
}
