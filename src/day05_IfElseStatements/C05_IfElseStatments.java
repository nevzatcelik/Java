package day05_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatments {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);
        if (girilenChar>='a' && girilenChar<='z'){
            System.out.println((char)(girilenChar-32)); //A
        }
        else {
            System.out.println(girilenChar);
        }

        char sayi1=70;
        char sayi2=71;
        char karakter='A';
        System.out.println(sayi1+sayi2); // 141
        System.out.println((char) (sayi1+sayi2)); // I
        System.out.println((char)+(sayi1)+(char)+(sayi2)); // 141
        System.out.println('A'); // A
        System.out.println((char)(karakter+1));
        System.out.println((char)+karakter+1);//

    }
}

