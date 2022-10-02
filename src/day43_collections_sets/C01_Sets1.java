package day43_collections_sets;

import java.util.*;

public class C01_Sets1 {
    public static void main(String[] args) {

        Set<Integer> sayilarKumesi=new HashSet<>();
        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(50);
        sayilarKumesi.add(40);
        sayilarKumesi.add(20);

        System.out.println(sayilarKumesi);
        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(40);
        sayilarKumesi.add(60);

        System.out.println(sayilarKumesi);

        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(1);
        sayilarList.add(2);



      sayilarKumesi.addAll(sayilarList);
        System.out.println(sayilarKumesi);




    }
}
