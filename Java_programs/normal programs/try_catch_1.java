public class try_catch_1 {
    public static void main(String[] args) {
        int a = 6000, b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } 
        catch (Exception e) {
            System.out.print("We failed to divide, Reason: ");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");
    }
}
