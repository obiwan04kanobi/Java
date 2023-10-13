package Java_programs.Collections;

import java.util.*;
/* 
 * Array deque is better than Linked list because it provides you with the ability to add/insert or remove elements from both the ends.
 * i.e from the beginning and from the end. But in Linked list you can only add/insert or remove elements from the beginning.
 * That's why Array deque is better than Linked list.
 * Deque stands for double entry queue.
 */
public class Array_deque_1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(14);
        ad1.add(12);
        ad1.add(45);
        ad1.add(14);
        ad1.add(64);
        ad1.add(88);   
        ad1.addFirst(999);  
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast()); 
    }
}
