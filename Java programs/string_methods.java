// SOME STRING METHODS

public class string_methods {
    public static void main(String[] args) {

        // you can create a String object by both of these methods
        String name = "Mayank";
        String name_1 = new String("Mayank");

        int str_len = name.length();
        String str_upper = name.toUpperCase();
        String str_lower = name.toLowerCase();

        String name_2 = "       Mayank          ";
        String str_trs = name_2.trim();

        System.out.println(str_len); // prints the length of the string.
        System.out.println(str_upper); // prints the string in uppercase
        System.out.println(str_lower); // prints the string in lowercase
        System.out.println(name_2); // untrimmed string with whitespaces
        System.out.println(str_trs); // trims out all the whitespaces leading to or after the string

    }
}
