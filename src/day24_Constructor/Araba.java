package day24_Constructor;

public class Araba {
    int IlanNo;
    String Marka = "Deger atanmadi";
    String model = " deger atanmadi";
    int yil;
    int fiyat;

    /* ozelleikleri bastan atayabilmek icin parametreli cons. olusturalim
    paramatre isimlerinin instance variable isimleri ile ayni olup olmamasi onemlidir
    once parametre isimlerini farkli yapalim
     */

    public Araba(int ilnNo,String mrk, String mdl,int yl,int fyt ) {
        IlanNo=ilnNo;
        Marka=mrk;
        model=mdl;
        yil=yl;
        fiyat=fyt;
    }
    /*
    parametre isimleri ile intance variable isimleri ayni olursa icinde oldugumuz scope'da
    isimde variable varsa java onu kullanacaktir
    class leveldeki variable oldugu Java ya belirtmek icin this. keyword kullanilmalidir
     */
    public Araba(int ilanNo, String marka, String model, int yil) {
        IlanNo = ilanNo;
        Marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public Araba(String marka, String model, int ilanNo, int yil, int fiyat) {
        this.IlanNo=ilanNo;
        this.Marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }

    public Araba (){

    }

    @Override
    public String toString() {
        return "Araba ozellikler" +
                "IlanNo=" + IlanNo +
                ", Marka='" + Marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
