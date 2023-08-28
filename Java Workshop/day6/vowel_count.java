import java.util.Scanner;

public class vowel_count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");

        String usr_input = sc.nextLine();

        String user_input_lower = usr_input.toLowerCase();

        char [] ch = user_input_lower.toCharArray();

 
        int vowel = 0;
        int consonant = 0;

        for (int i=0;i<user_input_lower.length();i++){

            if (ch[i] == 'a'|| ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){

                vowel++;

            }
            
            else if (ch[i] == ' '){
                continue;
            }

            else{
                consonant++;
            }

        }
        System.out.printf("No. of vowels is: %d and consonants is: %d",vowel,consonant);


    }
}