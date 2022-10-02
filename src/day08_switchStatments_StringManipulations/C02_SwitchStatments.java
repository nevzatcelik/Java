package day08_switchStatments_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatments {
    public static void main(String[] args) {

        /*
        Kullanicidan gun numarasini alip gun ismini yazdiran bir program yapin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz");

        int gunNo= scan.nextInt();

        if (gunNo<=0  || gunNo>7) {
            System.out.println("GECERSIZ GUN NUMARASI");
        } else if (gunNo==1){
            System.out.println("PAZARTESI");
        }else if (gunNo==2){
            System.out.println("SALI");
        }else if (gunNo==3){
            System.out.println("CARSAMBA");
        }else if (gunNo==4) {
            System.out.println("PERSEMBE");
        }else if (gunNo==5) {
            System.out.println("CUMA");
        }else if (gunNo==6){
            System.out.println("CUMARTESI");
        }else if (gunNo==7) {
            System.out.println("PAZAR");  }

           switch (gunNo){
               case 1 :
                   System.out.println("PAZARTESI");
                   break;
               case 2 :
                   System.out.println("SALI");
                   break;
               case 3:
                   System.out.println("CARSAMBA");
                   break;
               case 4:
                   System.out.println("PERSEMBE");
                   break;
               case 5:
                   System.out.println("CUMA");
                   break;
               case 6:
                   System.out.println("CUMARTESI");
                   break;
               case 7:
                   System.out.println("PAZAR");
                   break;
               default:
                   System.out.println("gecersiz gun numarasi girdiniz");




           }

    }
}