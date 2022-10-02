package day09_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        String str="Java cok guzel,cok.";

        System.out.println(str.endsWith("cok")); // False
        System.out.println(str.endsWith("cok.")); // True
        System.out.println(str.endsWith("")); // True

        /*
         Kullanicidan bir sifre alin
         - mail @ isareti icermiyorsa gecersiz mail diyelim
         - mail @gmail.com icermiyorsa, "mail gmail olmali"
         - mail @gmail.com ile bitmiyorsa "mailide yazim hatasi var" yazdiralim
         -eger bu hatalar yoksa mailiniz basari ile kaydedilmistir yazdirin

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail Giriniz");
        String mail= scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Gecersiz Mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mail de yazim hatasi var");

        } else {
            System.out.println("Mailiniz basari ile kaydedilmistir");
        }



    }
}
