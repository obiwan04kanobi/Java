public class default_constructor {

    String name;
    public static void main(String[] args) {
    // Basic default constructor is created on object creation if no specific constructor is inside the class
        default_constructor op = new default_constructor();

        op.name = "Java";

        System.out.println(op.name);
    }
}
