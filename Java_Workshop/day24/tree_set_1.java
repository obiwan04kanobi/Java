import java.util.*;
public class tree_set_1 {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>(); // TreeSet is a class. It is a dynamic array. It is not synchronized. It is sorted.
        ts.add(45);
        ts.add(15);
        ts.add(32);
        ts.add(19);
        System.out.println("Elements in Tree Set: "+ts); // Elements are already sorted in ascending order.
        System.out.println("Accessing Elements in Tree Set");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
}
