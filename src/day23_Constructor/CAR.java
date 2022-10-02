package day23_Constructor;

public class CAR {

    int IlanNo;
     String Marka="Deger atanmadi";
     String model= " deger atanmadi";
     int yil;
     int fiyat;


     public void maxHiz(String yakit){
         if (yakit.equalsIgnoreCase("benzinli")) {
             System.out.println("Benzinli araclar icin max hiz 240 km/h");
         } else if (yakit.equalsIgnoreCase("dizel")) {
             System.out.println("Dizel araclar icin max hiz 260 km/h");
         } else if (yakit.equalsIgnoreCase("elektrik")){
             System.out.println("elektrikli araclar icin max hiz 200 km/h");
         }else {
             System.out.println("girilen yakit turu gecerli degil");
         }

     }

    @Override
    public String toString() {
        return
                "IlanNo : " + IlanNo +
                ", Marka : '" + Marka + '\'' +
                ", model : '" + model + '\'' +
                ", yil : " + yil +
                ", fiyat : " + fiyat
                ;
    }

    public void vites(String yakit) {
        if (yakit.equalsIgnoreCase("benzinli")) {
            System.out.println("Benzinli araclar icin max hiz 240 km/h");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel araclar icin max hiz 260 km/h");
        } else if (yakit.equalsIgnoreCase("elektrik")) {
            System.out.println("elektrikli araclar icin max hiz 200 km/h");
        } else {
            System.out.println("girilen yakit turu gecerli degil");
        }
    }
}