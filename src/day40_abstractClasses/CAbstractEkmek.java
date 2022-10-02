package day40_abstractClasses;

public abstract class CAbstractEkmek {
    /*
    Bir abstract class in amaci object olusturmaj degil child class lari icin bir kalip olustumaktadir

    ornegin adi sadece ekmek olan bir obje yoktur
    Bu CLASS IN gorevi farkli ekmek turlerinin ortaya koyacaklari ozellikleri standartlastirmaktadir

    Bunu saglayabilmek icin
    1-  Class abstract yapilir
        bunun icin class keyword den once abstract yazilir
        bugune kadar olusturdugumuz abstract olmayan classlara da concrete class denir
    2- Bir class i abstract yapinca o class da abstract method olusturabiliriz
    abstract method:  body si olmayan,
                      child classlar icin zorunlu standart olacak methodlardir
    3- Bir abstract class in icinde abstract ve concrete methodlar bulunabilir
    Abstract methodlar child class lar tarafindan uyarlanmak(implement) zorundadir
    ancak contrete method'lari imlement etme mecburiyeti yoktur
    4- Concrete class larin icerisinde abstract method olmaz
    5-Abstact bir class abstract baska bir class a extends edilirse
    abstract methodlari implement etmek zorunda degildir
    abstract class kural koyucudur.Kurallari uygulayacaklar concrete classlardir
    bir abstract class yeni kurallar koyabilir ancak obje olusturulamayacagi icin
    koyulan kurallara uymak zorunda degildir
    Ancak isterse parent class daki method lar dan istedigini kendine uyarlayabilir
    6- Birden fazla abstract parenti olan ilk concrete class
    parent abstract class lardaki concrete hale donusturulmeyen tum abstract methodlari implement etmek zorundadir.
    7-Abstract class larin constructor lari vardir ama
    Abstract class lardan obje uretilemez.
    8-Abstract methodlar final veya private olamaz
    abstract methodlar override edilmek icin olusturulur
    static,final ve private methodlar override edilemez


     */
    public abstract void un();

    public abstract void maya();

    public void tuz() {
        System.out.println("Ekmekte tuz kullanilabilir");
    }

    public abstract void bicim();

    public abstract void gramaj();

}
