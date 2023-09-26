package day23;

import java.util.*;

public class linked_list_6 {
    public static void main(String[] args) {

        // removeFirst() and removeLast() are the same as remove() and poll() respectively
        Deque <String> ds = new java.util.LinkedList<>();
        ds.add("HI");
        ds.add("Hello");
        ds.add("Welcome");
        ds.add("Java Programming");
        ds.add("Language");
        System.out.println("Deque: "+ds);
        ds.removeFirst(); 
        System.out.println("After removing first element: "+ds);
        ds.removeLast(); 
        System.out.println("After removing last element: "+ds);
    

    }
}
