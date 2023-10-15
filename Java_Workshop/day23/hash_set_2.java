package day23;

import java.util.*;


public class hash_set_2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(16);
        al.add(401);
        al.add(32);
        al.add(10);
        al.add(27);
        System.out.println("Elements in ArrayList: "+al);
        Set<Integer> hs = new LinkedHashSet<>(al); // LinkedHashSet is a class that implements Set interface
        hs.addAll(al); // addAll() method adds all the elements of "al" to "hs"
        hs.add(32); // add() method adds an element to the set  
        System.out.println("Linked HashSet: "+hs); // Set does not allow duplicate elements

        boolean value = hs.remove(132); // contains() method checks if the element is present in the set
        System.out.println("After removing 32: "+hs);
        System.out.println("Is 32 present in the set? "+value);
        System.out.println(hs.removeAll(hs));
        System.out.println(hs);
    }
}
