package kendi_calismam;

import java.util.Scanner;

public class Giris_Ekrani_Password {
    public static void main(String[] args) {

        // Kullanicin girdigi password un zayif orta yuksek korumli sifre olarak su sartlarda belirleyin
        // kullanicin sifresi buyuk harf ile baslamali
        // eger kullanicin sifresi '-','!','?' iceriyorsa bunlari kullanamazsin
        // eger kullanicin sifresi 6 ten kucukse ve en az 1 harf iceriyorsa zayif sifre
        // kullanicin sifresi eger 9 ten kucukse ve en az 1 harf iceriyorsa orta sifre
        // kullanicin sifresi eger 12 den kucukse ve en az 1 harf iceriyorsa guclu sifre yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String girilenSifre = scan.nextLine();
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";


         boolean ozelKarakterVarmi=false;
        for (int i = 0; i < girilenSifre.length(); i++) {
            char ch = girilenSifre.charAt(i);
            if (specialCharacters.contains(Character.toString(ch))) {
                System.out.println(girilenSifre + " sifre ozel karakter iceremez");
                ozelKarakterVarmi=true;
                break;


            }

            if (ozelKarakterVarmi && girilenSifre.length()<=6) {
                System.out.println("zayif sifre");
                break;
            } else if (ozelKarakterVarmi==false && girilenSifre.length()<=10) {
                System.out.println("Orta sifre");
                break;

            }else if (ozelKarakterVarmi==false && girilenSifre.length()<=14) {
                System.out.println("Guclu sifre");
                break;
            } else {
                System.out.println("Sifre 20 karakterten fazla iceremez");
            }
        }
    }
}