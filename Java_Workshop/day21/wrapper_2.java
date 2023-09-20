package day21;

public class wrapper_2 {
    public static void main(String[] args) {
        Integer iobj = new Integer(550); // boxing
        int i = iobj.intValue(); // unboxing
        int j = iobj; // auto unboxing
        System.out.println(i+j);
    }
}
