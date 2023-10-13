package Java_programs.Collections;
import java.util.*;
/* 
 * ArrayList is better than normal array because it is dynamic in nature, i.e., it can grow or shrink as per the requirement.
 * If suppose you want to add/insert an element in the middle of the array, then you have to shift all the elements to the right side.
 * which is not possible in normal array, but in ArrayList it is possible. That's why ArrayList is better than normal array.
 */
public class array_list_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(45);
        l1.add(14);
        l1.add(64);
        l1.add(88);
        l1.add(0,5); //adding number 5 at index 0
        System.out.println(l1);

        System.out.println("Printing array elements using for loop");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println();

        System.out.println("Printing array elements using for-each loop");
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        System.out.println();

        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(445);
        l2.add(422);
        l2.add(987);
        l2.add(789);
        l2.add(353);

/*         l1.addAll(l2); //combining arraylist l1 with l2, where l2 is added at the end by default

        System.out.println("combining arraylist l1 with l2");
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        System.out.println(); */

        l1.addAll(0, l2); //combining arraylist l1 with l2, where l2 is added at the beginning at index 0
        System.out.println("combining arraylist l1 with l2");

        System.out.println();
        for (Integer integer : l1) {
            System.out.println(integer);
        }

    }
}
