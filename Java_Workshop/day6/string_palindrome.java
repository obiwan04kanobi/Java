import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String user_input = sc.nextLine();

        char [] ch = (user_input.toLowerCase()).toCharArray(); // converting the user input into lowercase and then to character array

        String rev = "";  // initialising an empty reverse string

        for (int i =(user_input.length()-1);i>=0;i--){

            rev += ch[i];
        }

        char [] rev_1 = rev.toCharArray(); // converting reverse to an char array

        int check = 0; 

        for (int i =0;i<user_input.length();i++){
            
            // checking the last character of the reverse array with the first character of the user input array
            if (rev_1[i] == ch[i]){
                    check++;
            }
        }

        // checking if the check variable has the same integer value of length of user input as original user value
        if (check == user_input.length()){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
