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

        System.out.println(name.substring(3)); // print the string starting from index 3 till the end.
        System.out.println(name.substring(0)); // print the string starting from index 0 till last, which is essentially printing the whole string as it is.


        System.out.println(name.substring(1,5));

        System.out.println(name.replace('a', 'p'));
        System.out.println(name.replace("ay", "ier"));

        System.out.println(name.startsWith("May"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String name_3 = "Harryrryrry";
        System.out.println(name_3.indexOf("rry")); 
        System.out.println(name_3.indexOf("rry", 4)); // start searching for string "rry" from 4th index
        System.out.println(name_3.lastIndexOf("rry")); // gives the last occurance of string "rry"
        System.out.println(name_3.lastIndexOf("rry", 7)); // start searching for the last occurance of string "rry" before the 7th index. 
        System.out.println(name_3.indexOf("rry6")); // the output is (-1) when a substring does not exist inside a string. 

        System.out.println(name_3.equals("Harry")); // to check if a given string is equal to a provided string. (NOTE: use this whenever you need to find that if two string are equal rather than using the "==" operator)
        System.out.println(name_3.equalsIgnoreCase("harry")); // returns true if the strings are equal ignoring the cases (i.e does not matter uppercase or lowercase, as long as the strings are equal).

        System.out.println("I am escape sequence\tdouble quote");

    }
}
