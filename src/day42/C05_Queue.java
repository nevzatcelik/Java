package day42;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {
    public static void main(String[] args) {

        Queue<String> yemeksirasi=new LinkedList<>();
        yemeksirasi.add("Ali");
        yemeksirasi.add("Veli");
        yemeksirasi.add("Ayse");
        yemeksirasi.add("Kemal");

        System.out.println(yemeksirasi); // [ali,veli ayse,kemal]
        System.out.println(yemeksirasi.element()); // ali
        System.out.println(yemeksirasi); // [ali,veli,ayse,kemal]

        System.out.println(yemeksirasi.peek()); // ali
        System.out.println(yemeksirasi);//[ali,veli,ayse,kemal]


        Queue<String> queDeneme=new LinkedList<>();
        System.out.println(queDeneme.peek()); // Null
      //  System.out.println(queDeneme.element()); // exception

        yemeksirasi.offer("Fatma");
        System.out.println(yemeksirasi); // [ali,veli,ayse,kemal,Fatma]

        System.out.println(yemeksirasi.poll()); // ali yi getirdi
        System.out.println(yemeksirasi);//[Veli,kemal,ayse,fatma]
        System.out.println(yemeksirasi.remove()); // veli
        System.out.println(yemeksirasi); //[ayse kemal fatma]
        System.out.println(queDeneme.poll()); // null
        System.out.println(queDeneme.remove()); // exception

   }
}
