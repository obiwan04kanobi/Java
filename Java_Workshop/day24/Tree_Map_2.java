
import java.util.*;

public class Tree_Map_2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> hm = new TreeMap<>();  // it stores the data in key-value pair. values are unordered and unsorted. 
        hm.put("Rajeev",98); // put() is used to add the data in the map.
        hm.put("Shagun",89);
        hm.put("Mehul",37);
        hm.put("Kashif",45);
        hm.put("Salman",69);
        System.out.println("Nav Map Values: "+hm);
        System.out.println("First Key: "+hm.firstKey()); // firstKey() is used to get the first key of the map.
        System.out.println("Last Key: "+hm.lastKey()); // lastKey() is used to get the last key of the map.
        System.out.println("Fist Entry: "+hm.firstEntry()); // firstEntry() is used to get the first key-value pair of the map.
        System.out.println("Last Entry: "+hm.lastEntry()); // lastEntry() is used to get the last key-value pair of the map.
    }
}
