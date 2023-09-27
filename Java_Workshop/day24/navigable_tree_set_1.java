import java.util.*;

public class navigable_tree_set_1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); // TreeSet is a class which implements NavigableSet Interface. 
        ts.add(16);
        ts.add(15);
        ts.add(45);
        ts.add(32);
        ts.add(19);
        System.out.println(ts);
        System.out.println("Access First Element: "+ts.first()); // Access First Element 
        System.out.println("Access Last Element: "+ts.last());   // Access Last Element 
        System.out.println("Higher: "+ts.higher(32));   // Higher Element than 32
        System.out.println("Lower: "+ts.lower(32));     // Lower Element than 32.
        System.out.println("Ceiling: "+ts.ceiling(32)); // Ceiling Element than 32. If 32 is present then 32 will be printed. 
        System.out.println("Floor: "+ts.floor(19));    // Floor Element than 19. If 19 is present then 19 will be printed. 
        System.out.println("Remove First Element: "+ts.pollFirst()); // Remove First Element
        System.out.println("Remove Last Element: "+ts.pollLast());   // Remove Last Element
        System.out.println("After Removing elements: "+ts);
    }
}
