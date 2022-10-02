package day04_Operators;

public class C02_BasitIfCumleleri {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        if (a*b>100) {
            System.out.println("Carpımları 100 den buyuk");// OK DEGIL
        }

        if (a<b)  System.out.println("a b den kucuk");

        // ıf sartından sonra sadece 1 satır kod yazacaksak suslu parantez kullanmasak da olur

        if (b<0) {
            System.out.println("b 0 dan buyuk");
            System.out.println("3.sartın ıkıncı satırı");
            System.out.println("3.sartın 3.satırı");
        }

        /*BASIT IF CUMLELERI KODUN GERI KALANI ILE ILGILENMEZ. DOLAYISYLA TUM BASIT IF CUMLELERI  BODY'LERI
         CALISABILECEGI GIBI HIC BIRI CALISMAYADABILIR

         */


        boolean c=true;

        if (c) {
            System.out.println("c li if calıstı");}
    }
}
