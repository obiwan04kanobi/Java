import java.util.*;

public class Hash_Map_1 {
    public static void main(String[] args) {
        
        Map<String,Integer> hm = new HashMap<>(); // it stores the data in key-value pair. values are unordered and unsorted.
        hm.put("Rajeev",98); // put() is used to add the data in the map.
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
        
        hm.replace("Mehul", 76);    // replace() is used to replace the value of the key.  
        System.out.println("Updated: "+hm);

        hm.remove("Rajeev");    // remove() is used to remove the key-value pair. 
        System.out.println("Updated: "+hm);
    }
}

