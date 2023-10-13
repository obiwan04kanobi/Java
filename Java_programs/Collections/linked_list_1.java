package Java_programs.Collections;
import java.util.*;
/* 
 * Linked list is better than Array list because if you want to add an element in the middle of the array, then you have to shift all the elements to the right side.
 * but in Linked list you just have to link the new elements with the previous and next element in the queue and no shifting of elements is required.
 * which saves a lot of time and memory. That's why Linked list is better than Array list.
 */
public class linked_list_1 {
    public static void main(String[] args) {
        /* Linked list and Array list are almost similar when it comes to methods except a few */
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(45);
        l1.add(14);
        l1.add(64);
        l1.add(88); 
        l1.addLast(456); //method adds an element in last (not available in ArrayList)
        l1.addFirst(342); //method adds an element in first (not available in ArrayList)
        System.out.println(l1);
        System.out.println(l1.getFirst()); //method returns the first element (not available in ArrayList)
        System.out.println(l1.getLast()); //method returns the last element (not available in ArrayList)
    }
}
