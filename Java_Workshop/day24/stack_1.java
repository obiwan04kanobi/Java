import java.util.*;

public class stack_1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();   // Creating Stack
        s.push(27); // Insertion
        s.push(56);
        s.push(98);
        s.push(12);
        System.out.println("Stack Using Push: " + s);
        System.out.println("Deletion: " + s.pop()); // Deletion
        System.out.println("Remaining Elements: " + s);
        System.out.println("Top Most Element: " + s.peek()); // Top Most Element
        System.out.println("Search: " + s.search(98)); // Search Element in Stack and return position of element
        s.clear(); // Clear Stack
        System.out.println("Empty or not: " + s.empty()); // Empty or not

    }
}
