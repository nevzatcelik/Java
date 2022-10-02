package day32_encapsulation_intheritance;

public class C01 {
   private int yas;
       private String isim;

    public static String getHastaneAdi() {
        return hastaneAdi;
    }

    public static void setHastaneAdi(String hastaneAdi) {
        C01.hastaneAdi = hastaneAdi;
    }

    private static String hastaneAdi="Yildiz Hastanesi";

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>=0)
        this.yas = yas;
        else {
            System.out.println("Negatif yas giremezsin");
        }
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

