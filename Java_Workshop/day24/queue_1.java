import java.util.*;

public class queue_1 {
    public static void main(String[] args) {
       Queue<Integer> q = new PriorityQueue<>();
       Collections.addAll(q, 2, 56, 24, 65, 5);
       System.out.println(q.offer(24));
       System.out.println(q);
       System.out.println(q.poll());
       System.out.println(q);
       System.out.println(q.peek());
       System.out.println(q.remove(65));                                                                                                      
       System.out.println(q);
    }
}
