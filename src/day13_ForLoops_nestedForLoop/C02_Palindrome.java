package day13_ForLoops_nestedForLoop;

import java.util.Scanner;

public class C02_Palindrome {
    public static void main(String[] args) {
         // tersten okunusu orjinal metnin ile ayni olan metinlere palidrome denir

        //KULLANICIDAN BIR CUMLE ALIN. GIRILEN CUMLENIN PALIDROME OLUP OLMADIGINI KONTROL EDIN

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle veya sayi giriniz");
        String cumle= scan.nextLine();

        String tersCumle="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersCumle += cumle.charAt(i); // bunun anlami ters cumleye charAt i ekleyip atama yap demek
        }
        if (cumle.equalsIgnoreCase(tersCumle)) {
            System.out.println("Girdiginiz metin palidrome");
        } else {
            System.out.println("Girdiginiz cumle palidrome degil ");
        }

    }
}
