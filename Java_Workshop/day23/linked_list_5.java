package day23;

import java.util.*;

public class linked_list_5 {
    public static void main(String[] args) {
        Queue<String> qs = new LinkedList<>(); // Queue is an interface. LinkedList implements Queue. 
        qs.add("Java");
        qs.add("Python");
        qs.add("C++");
        System.out.println("Elements: "+qs);
        String str = qs.peek(); // returns the top element
        System.out.println("Top element: "+str);
        String s = qs.poll();   // removes the top element
        System.out.println("Removed element: "+s);
        System.out.println("After Poll: "+qs);
        qs.add("Java");
        qs.add("DSA");
        System.out.println(qs);
        qs.offer("Programs");  // adds element at the end
        System.out.println("At end: "+qs);
    }
}
