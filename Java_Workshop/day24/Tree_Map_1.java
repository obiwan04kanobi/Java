
import java.util.*;

public class Tree_Map_1 {
    public static void main(String[] args) {
        Map<String,Integer> hm = new TreeMap<>(); // it stores the data in key-value pair. values are unordered and unsorted.
        hm.put("Rajeev",98); // put() is used to add the data in the map.
        hm.put("Shagun",89);
        hm.put("Mehul",37);
        hm.put("Kashif",45);
        hm.put("Salman",69);
        System.out.println("Map Values: "+hm);
        System.out.println("Key/Value: "+hm.entrySet()); // entrySet() is used to get the key-value pair.
        System.out.println("Keys: "+hm.keySet()); // keySet() is used to get the keys of the map.q
        System.out.println("Values: "+hm.values()); // values() is used to get the values of the map.
        System.out.println("get: "+hm.get("Preet")); // get() is used to get the value of the key.
        System.out.println("Get Default: "+hm.getOrDefault("Preet", 85)); // getOrDefault() is used to get the value of the key if it is present otherwise it will return the default value.
    }
}
