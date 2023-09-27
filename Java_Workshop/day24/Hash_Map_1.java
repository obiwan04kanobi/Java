import java.util.*;

public class Hash_Map_1 {
    public static void main(String[] args) {
        
        Map<String,Integer> hm = new HashMap<>(); // it stores the data in key-value pair. values are unordered and unsorted.
        hm.put("Rajeev",98);
        hm.put("Shagun",89);
        hm.put("Mehul",37);
        hm.put("Kashif",45);
        hm.put("Salman",69);
        System.out.println("Map Values: "+hm);
        System.out.println("Keys: "+hm.keySet());
        System.out.println("Values: "+hm.values());
        System.out.println("Implementing by using Iterator");
        for (String keys : hm.keySet()) {
            System.out.println(keys+" : "+hm.get(keys));
        }
            
    }
}

