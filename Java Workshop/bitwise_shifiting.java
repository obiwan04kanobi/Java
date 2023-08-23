public class bitwise_shifiting {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;
        int c = 2;
        int d = 5;

        System.out.println("Left shifting A with 1 bit");
        System.out.println(a<<b);
        System.out.println("Left shifting A with 2 bits");
        System.out.println(a<<c);

        System.out.println("Right shifting B with 1 bit");
        System.out.println(d>>b);
        System.out.println("Right shifting B with 2 bit");
        System.out.println(d>>c);        
    }
}
