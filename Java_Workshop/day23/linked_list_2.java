package day23;

import java.util.*;

public class linked_list_2 {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Nirav Modi");
        ls.add("Mehul Choksi");
        ls.add("Lalit Modi");
        ls.add("Jatin Mehta");
        ls.add("Vijay Malya");
        System.out.println(ls);
        System.out.println("Particular Element: "+ls.get(2)); //get() method returns the element at the specified index
        ls.set(2, "Rajeev Gandhi"); //set() method replaces the element at the specified index
        System.out.println("Updated List: "+ls);
        ls.remove(3);
        ls.remove("Mehul Choksi");
        System.out.println("After Removing: "+ls);

        Collections.addAll(ls, "Preet", "Sanjay", "Rahul", "Preet", "Shagun");
        System.out.println("After Adding: "+ls);
        System.out.println("First Occurance of Preet: "+ls.indexOf("Preet"));
        System.out.println("Last Occurance of Preet: "+ls.lastIndexOf("Preet"));
    }
}
