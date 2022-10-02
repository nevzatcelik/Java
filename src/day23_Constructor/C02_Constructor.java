package day23_Constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        arb1.marka="Toyota";
        arb1.model="Corolla";

        System.out.println(arb1.marka+", " + arb1.model);
        //toyota corolla

        Araba arb2= new Araba();
        System.out.println(arb2.marka+"."+arb2.model);
        //null
      Araba arb3=new Araba("Corolla");
    }
}
