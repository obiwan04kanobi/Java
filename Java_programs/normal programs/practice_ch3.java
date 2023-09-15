//import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

public class practice_ch3 {
    public static void main(String[] args) {
        /* 

        // Problem 1
        System.out.println("Program to convert A string to lowercase");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        
        String name = sc.nextLine();
        String lowercase_name = name.toLowerCase();
        System.out.printf("Lowercase String is, %s \n",lowercase_name);
        

        // Problem 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem to replace the spaces in a text with underscores");
        System.out.println("Input String: ");
        String text = sc.nextLine();
        text = text.replace(" ", "_");
        System.out.printf("After Replacements: %s \n",text);
        

        // Problem 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to replace the <|name|> in the string to a user provided name");
        System.out.println("Input name: ");
        String name = sc.nextLine();
        String phrase = "Dear <|name|>, thanks a lot";
        phrase = phrase.replace("<|name|>", name);
        System.out.println(phrase);
        

        //Problem 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if a text has double or triple spaces");
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        int double_space_check = text.indexOf("  ");
        int triple_space_check = text.indexOf("   ");

        if (double_space_check != -1) 
        {
            System.out.println("double space exists !");
        } 

        if (triple_space_check != -1) 
        {
            System.out.println("triple space exists !");
        }

        else
        {
            System.out.println("no double or triple space exists");
        }

        */

        //Problem 5
        System.out.println("Problem to format a string using escape sequence characters");
        String letter = "Dear Harry,\n\tThis Java Course is Nice.\n\tThanks!"; // we used "\n", a escape seq character to print the text after it in new line and "\t" to put a space of a single TAB in the text.
        System.out.println(letter);
    }
}
