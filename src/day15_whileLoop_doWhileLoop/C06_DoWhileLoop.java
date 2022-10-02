package day15_whileLoop_doWhileLoop;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        int sayi = 10;
        while (sayi<14){
            System.out.println(sayi);

            sayi++;
        }

        /*
        while loop loop sayisindan bir fazla sart kontrolu yapar
        bunun onune gecmek icin do-while loop kullanabiliriz

        2- while loop da ilk deger sarti saglamiyorsa while body si
        hic calismayabilir
        ancak do while loop kullanirsak body en az bir kere MUTLAKA calisir

         */

        sayi=10;
        do {
            System.out.println(sayi);
            sayi++;

        }while (sayi<14);
    }
}
