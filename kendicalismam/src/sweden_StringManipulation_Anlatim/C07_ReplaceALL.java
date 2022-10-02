package sweden_StringManipulation_Anlatim;

public class C07_ReplaceALL {
    public static void main(String[] args) {
        /*
        \\d A digit: [0-9] == rakam olan indexleri degistirme yada rakam olmayani rakam yapar
        \\D A non-digit: [^0-9] == rakam olmayan herseyi rakam yapar
        \\s A whitespace character: [ \t\n\x0B\f\r]
        \\S A non-whitespace character: [^\s]
        \\w A word character: [a-zA-Z_0-9]
        \\W A non-word character: [^\w]
         */

        String str1="Ali 99 tane elmayi 426894 Ali liradan satti";
       str1=str1.replaceAll("\\d","4"); // digit- 1 den 9 a kadar olanlari replacement degistirecek
        System.out.println(str1);

          str1=str1.replaceAll("Ali","9");
        System.out.println(str1);

         str1=str1.replaceAll("\\d",""); // 1 den 9 kadar olan rakamlari "" yerine degistirecek
        System.out.println(str1);





        String str2="Ali 99 tane!elmayi 4 liradan satti";
        str2=str2.replaceAll("\\D","*");
        System.out.println(str2);





         String str3="Ali 99 tane elmayi 4 liradan satti";
        str3=str3.replaceAll("\\s","s");
        System.out.println(str3);
        str3=str3.replaceAll("\\S","A");
        System.out.println(str3);



        String str4="Ali 99 tane elmayi 4 liradan satti ";
        str4=str4.replaceAll("\\w","2"); // w: harf ve rakam olan herseyi 2 ile degistiregiz
        System.out.println(str4);
        str4=str4.replaceAll("\\W","z");
        System.out.println(str4);

    }
}
