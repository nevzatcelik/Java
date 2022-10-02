package day41_Interfaces;

public interface I01_IntefacesEkmek {
    /*
    Interface ler tam abstraction saglar
    iclerinde CONCRETE method BULUNMAZ
    Interface ler concrete child class lar icin blueprint(sablon) ozelligi tasir.

    Interface in class a gore cok buyuk bir Avantaji vardir
    Java da bir class sadece 1 class i parent edinebilir.
    Eger birden fazla classi  parent edinmek istersek hiyerarsi ile parent zinciri olustururuz.

    Interface lerde durum farklidir;
    bir class istedigi kadar interface'i implement edebilir

    Bir class i bir interface e child yapmak icin extends DEGIL implements keyword KULLANILIR
    istenirse interface de baska bir interface i parent edilebilir
    bu durumda interfaceler arasinda extends keyword kullanilir.

    Bir class hem baska bir class a extends ile child olup hem de istedgi kadar interface i implement edebilir

    Interfacelerde sadece public ve abstract method lar bulunur

    Interface lerde variable lar da public,static ve final dir

    Variable ler final oldugu icin sonradan degeeri degistirilemez, olustururken deger atamasi yapmak zorunludur

        birden fazla interface i implement eden bir class tum interface lerdeki variable lara ulasabilir
        eger ayni isimde bir variable birden fazla parent interface de varsa
        Java static yolu kullanarak interfaceAdi.variableAdi ile karsikligin onune gecirir

        Eger farkli iki parent interface ayni isimde method varsa
        biz bir kere override etsek yeterli olacaktir

        Farkli Interface lerdeki methodlarin return type lari da farkli ise bu durumda her method kendi return
        type ini isteyecektir
        birini yapsak oteki kabul etmeyecektir. BU SORUNUN COZUMU PARENT INTERFACE'LERE mudahale edip ayni isimdeki
        methodun return type ini esitlemek gerekir

     */
    public abstract void un();
    public abstract void maya();
    public abstract void bicim();
    public abstract void gramaj();

}
