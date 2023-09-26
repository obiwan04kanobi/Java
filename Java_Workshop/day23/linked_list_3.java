package day23;
/*
 * write a java code to implement odd elements by using linked list
 */

import java.util.*;
public class linked_list_3 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        for(int i=1; i<=10; i++) {
            ls.add(i);
        }
        System.out.println("Original List: "+ls);
        for(int i=0; i<ls.size(); i++) {
            if(ls.get(i)%2 == 0) {
                ls.remove(i);
            }
        }
        System.out.println("Odd Elements in list: "+ls);
    }
}
