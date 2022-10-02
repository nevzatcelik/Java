package day40_abstractClasses;

public class BCevizliEkmek  extends  AEkmek{
    public static void main(String[] args) {
        /*
        Klasik inheritance ile child class lari ile kendilerine ozel methodlar uretmeye zorlayamazsiniz
        Child class lar isterlse parent class daki methodlari override ederek kendilerine uyarlayabilirler
        istemezlerse babam sagolsun diyip parent class daki method lari kullanabilirler
         */
        BCevizliEkmek ekmek1=new BCevizliEkmek();
        ekmek1.un();
        ekmek1.bicim();
        ekmek1.gramaj();
        ekmek1.bicim();
        ekmek1.tuz();
    }
}
