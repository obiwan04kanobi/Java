public class increment_decrement_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 45;
        int d = 23;

        System.out.println("Performing Pre-Increment on A");
        System.out.println(++a);
        System.out.println("Performing Pre-Decrement on A");
        System.out.println(--a);


        System.out.println("Performing Pre-Increment on B");
        System.out.println(++b);
        System.out.println("Performing Pre-Decrement on B");
        System.out.println(--b);
    
        System.out.println("Performing Post-Increment on C");
        System.out.println(c++);
        System.out.println(c++);

        System.out.println("Performing Post-Decrement on C");
        System.out.println(c--);
        System.out.println(c--);

        System.out.println("Performing Post-Increment on D");
        System.out.println(d++);
        System.out.println(d++);                

        System.out.println("Performing Post-Decrement on D");
        System.out.println(d--);        
        System.out.println(d--);
    }
}
