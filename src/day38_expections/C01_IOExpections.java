package day38_expections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExpections {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Method signature ina ekledigimiz
        throws FileNotFoundException
        sadece bilgi vermek icindir
        try-catch deki gibi expection i handle etmez
        Sadece java ya sorumluluk bizde sen calismana bak expection ile karsilasirsan expection firlat demektir
         */

            String path="src/day37_expections/TextFile";

        FileInputStream fis=new FileInputStream(path);

    }
}
