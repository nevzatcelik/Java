package day23_Constructor;

public class Araba {
    /*
    Bir class olusturuldugunda
    Java o class'dan obje olusturulmasina imkan vermek icin
    class'a bizim goremedigimiz bir constructor yerlestirir

    Java'nin koydugu ve bizim goremedigimiz bu constructor'a
    default constructoe denir
    ve default constructor objenin hic bir ozelligini degistirmeden
    instance variable degerleriyle obje olusturur

    default constructor parametresizdir
    ve body'sinde hic kod yoktur


     */
    String model;
    String marka;

    Araba() {
        /*
        Default constructor parametresiz bir constructor'dir.
        ama bizim manuel olarak yazacagimiz parametresiz constructor
        default controctur DENMEZ

        CUNKU default constructor in bodysinde kod olmaz ama
        parametresiz contructor larda body ye kod ekleyebiliriz

         */
    }
    Araba(String model) {
        /* biz bir class da manuel olarak constructor olusturdugumuzda
        java default constructor i siler

        Bu icinde bulundugumuz class da olmasa bile bu clastan obje ol
        usturan diger claslarda cte ye sebeb olabilir

        Cunku kullanilan default constructor artik olmayacaktir.

        Bununn cozumu adina bir class da herhangi bir
        parametreli constructor olusturursak diger klaslarda sorun olustur
        mamasi icin default constructor yerine parametresiz bir constructor
        olusturmaliyiz
         */
    }
}
