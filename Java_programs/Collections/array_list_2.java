package Java_programs.Collections;

import java.util.*;

public class array_list_2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(14);
        l1.add(12);
        l1.add(45);
        l1.add(14);
        l1.add(64);
        l1.add(88);   
        System.out.println(l1);
       //l1.clear(); //clears or empties the arraylist
        System.out.println(l1);

        System.out.println(l1.contains(45)); //returns two or false based on if an element is in the arraylist or not
        System.out.println(l1.contains(35));
        System.out.println(l1.indexOf(14)); //returns the index of first occurance of an element in arraylist. 
        System.out.println(l1.lastIndexOf(14)); //returns the index of last occurance of an element in arraylist.
        System.out.println(l1.indexOf(35)); //returns -1 because element does not exist in arraylist
        l1.remove(0); //removes an element from a specified index
        System.out.println("After removing 14 from index 0: "+l1);
    }
}
