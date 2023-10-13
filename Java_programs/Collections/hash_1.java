package Java_programs.Collections;

import java.util.*;
/* 
 * HashSet is primarily usefull if we have a large collection of data and we want to search for an element
 * we can use techniques like hashing to search for an element in a large collection of data.
 * which saves us a lot of time. Hashing is a technique in which the element are stored after passing through a hash function.
 * f(x) = x % 10 (hash function)
 * 14 % 10 = 4, means 14 will be stored at index 4.
 */
public class hash_1 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(6, 0.5f);
        h1.add(14);
        h1.add(12);
        h1.add(45);
        h1.add(14);
        h1.add(64);
        h1.add(88);
        System.out.println(h1);

        //same methods as array list
    }
}
