package day39;

public class C01_FinnalyBlok {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Bolecek sayi 0 olamaz");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finnaly blok calisti");
        }


    }
}
