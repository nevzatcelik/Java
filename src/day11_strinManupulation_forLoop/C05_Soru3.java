package day11_strinManupulation_forLoop;

public class C05_Soru3 {
    public static void main(String[] args) {
        /*
        Kullancinin String olarak verdigi iki fiyati toplayabilen bir kod yaziniz

         */

        String fiyat1="$20,25";
        String fiyat2="$34.40";

        fiyat1=fiyat1.replaceAll("\\D","");
        fiyat2=fiyat2.replaceAll("\\D","");

        System.out.println(fiyat1+fiyat2);

        Double sayi1=Double.parseDouble(fiyat1);
        Double sayi2=Double.parseDouble(fiyat2);

        System.out.println("sayi1 : "  + sayi1);
        System.out.println("sayi2 :" + sayi2);
        System.out.println("sayi1+sayi2 : $" + (sayi1+sayi2)/100);

          /*
          parseInteger veya parseDouble
          string olarak girilen ancak TAMAMEN SAYILARDAN olusan bir ifadeyi int veya double a cevirir
           */
    }
}
