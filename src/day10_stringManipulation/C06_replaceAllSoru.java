package day10_stringManipulation;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini soy ismini ve kk numarasini alin
        asadaki formatta kaydedip yazdiralim

        M***** T****
        1234  **** ***'
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen kk giriniz");
        String kkNo= scan.nextLine();

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*")+
                " "+
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");

        String yeniKkNo= kkNo.substring(0,4)+ " **** **** ****";

        System.out.println(yeniIsim+"\n"+yeniKkNo);




    }
}
