package day23_Constructor;

public class CarRunner {
    public CarRunner() {
    }

    public static void main(String[] args) {

        CAR car1=new CAR();
        System.out.println(car1.fiyat+ ", "+ car1.IlanNo+", "+
                car1.Marka+"," + car1.model+", "+car1.yil);

        //0, 0, Deger atanmadi, deger atanmadi, 0
        car1.yil=2017;
        car1.model="Prius";
        car1.Marka="Toyota";
        car1.IlanNo=1234;
        car1.fiyat=12000;


        System.out.println(car1.fiyat+ ", "+ car1.IlanNo+", "+
                car1.Marka+"," + car1.model+", "+car1.yil);

        CAR car2=new CAR();
        System.out.println(car2);

        car2.yil=2019;
        car2.model="Corsa";
        car2.Marka="Opel";
        car2.IlanNo=1235;
        car1.fiyat=10000;
        System.out.println(car2);


    }
}
