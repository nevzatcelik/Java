package day41_Interfaces;

public class MChildOf2Interfaces implements I04_Parent1,I05_Parent2 {

    public static void main(String[] args) {
        System.out.println(sayi1); // 10 yazidiri
        System.out.println(I04_Parent1.sayi2);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }
    public static void method3(){
        System.out.println("interface static method");
    }
}
