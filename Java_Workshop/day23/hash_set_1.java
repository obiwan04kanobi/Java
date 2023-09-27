package day23;
import java.util.*;

public class hash_set_1 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>(); // HashSet is a class that implements Set interface
        hs.add(16);
        hs.add(15);
        hs.add(401);
        hs.add(59);
        hs.add(10);
        hs.add(27);
        System.out.println("Elements in Set 1: "+hs); // Set does not allow duplicate elements
        Set<Integer> hs2 = new HashSet<>();
        hs2.add(35);
        hs2.add(65);
        hs2.add(79);
        hs2.add(21);
        System.out.println("Elements in Set 2: "+hs2);
        hs.addAll(hs2); // addAll() method adds all the elements of hs2 to hs
        System.out.println("Elements in Set 1 after adding Set 2: "+hs); //hashset does not maintain order
    }
}
