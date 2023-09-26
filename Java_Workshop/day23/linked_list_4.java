package day23;
/*
 * write a java code to sort elements in reverse order but print elements alternatively
 */
import java.util.*;
public class linked_list_4 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        for(int i=1; i<=10; i++) {
            ls.add(i);
        }
        System.out.println("Original List: "+ls);
        Collections.sort(ls, Collections.reverseOrder());
        System.out.println("Sorted List: "+ls);
        for(int i=0; i<ls.size(); i++) {
            if(i%2 == 0) {
                System.out.print(ls.get(i)+" ");
            }
        }
        System.out.println();
    }
}
