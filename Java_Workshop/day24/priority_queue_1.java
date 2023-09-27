
import java.util.*;

public class priority_queue_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default is min heap (ascending order) 
        pq.offer(4);
        pq.add(6);
        pq.offer(5);
        pq.add(1);
        System.out.println("Priority Queue Implementation: " +pq);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); // max heap (descending order)
        pq1.offer(4);
        pq1.add(6);
        pq1.offer(5);
        pq1.add(1);
        System.out.println("Priority Queue Implementation: " + pq1);




    }
}
