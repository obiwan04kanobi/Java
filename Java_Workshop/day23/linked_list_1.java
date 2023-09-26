package day23;
import java.util.*;
public class linked_list_1 {
    public static void main(String[] args) {
        
        List<Integer> li = new LinkedList<>();
        li.add(25);
        li.add(32);
        li.add(12);
        li.add(10);
        li.add(56);
        System.out.println(li);
        
        System.out.println("For Each Loop");
        for(Integer i : li){
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("Iterator");
        Iterator it = li.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        
        System.out.println("reverse Iterator");
        ListIterator lit = li.listIterator(li.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous()+" ");
        }

    }
}
