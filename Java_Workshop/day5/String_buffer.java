package day5;

public class String_buffer {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("The");
        str.append(" Beatles");
        System.out.println(str);
        System.out.println(str.charAt(5));
        System.out.println(str.capacity()); // capacity() returns the current capacity of the String
        System.out.println(str.length()); // length() returns the length of the String
        System.out.println(str.reverse()); // prints the string in reverse order
    }
}
