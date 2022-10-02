package day42;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {
        /*
        Temel ozelligi linked olmasi.(elementlerin birbirine bagli sekilde siralanmasidir.)
        LinkedList 3 interface i implement etmistir
        1-List
        2-deque
        3-queue
        data turunu hangisinden secersek onun ozelliklerini tasir
         */

        LinkedList<Integer> ll1=new LinkedList<>(); // List,Queue ve deque ozelliklerinin hepsini tasir
        List<Integer> ll2=new LinkedList<>();
        Deque<Integer> ll3= new LinkedList<>();
        Queue<Integer> ll4= new LinkedList<>();

        ll2.add(10);
        ll2.add(20);
        System.out.println(ll2);//[10,20]
        ll2.add(0,30);
        System.out.println(ll2); // [30,10,20]
    }
}
