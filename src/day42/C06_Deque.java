package day42;

import java.util.Deque;
import java.util.LinkedList;

public class C06_Deque {
    public static void main(String[] args) {

        Deque<String> stokList=new LinkedList<>();

        // Deque : cit tarafli queue demektir
        // yani iki taraftan eklenebilir silinebilir

        stokList.addLast("Malzeme1");
        stokList.addFirst("Malzeme2");
        System.out.println(stokList);
    }
}
