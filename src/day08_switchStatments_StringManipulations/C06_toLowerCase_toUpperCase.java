package day08_switchStatments_StringManipulations;

import java.util.Locale;

public class C06_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        // String i istedigimiz sekilde buyuk harf veya kucuk harfe cevirebiliriz ORN:

        String str= "Java candir";
        System.out.println(str.toUpperCase());
        System.out.println(str); // Java candir

        //Eger kalici olarak degistirmek istersek atama yapmaliyiz ORN:

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // Java candir

        // EGER buyuk kucuk harf cevirirken bir dile gore yapmak isterseniz

        System.out.println(str.toLowerCase(Locale.GERMAN)); // java candir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); //java candir

        str=str.toLowerCase(); //java candir
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
