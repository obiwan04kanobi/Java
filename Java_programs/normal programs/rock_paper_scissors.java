import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("Enter 'p' for PAPER, 's' for scissors and 'r' for ROCK");
        
        System.out.println("Enter No. of Rounds:");
        
        int rounds = sc.nextInt();
        int human= 0;
        int computer = 0;
        int num_val = 0;

        for(int i = 0;i<rounds ;i++){


            System.out.println("Enter value: ");

            int comp_input = rd.nextInt(3);
            
            char value = sc.next().charAt(0);

            if (value == 'p'){
                num_val += 0;
            }
            else if (value == 's'){
                num_val += 1;
            }
            else if (value == 'r'){
                num_val += 2;
            }

            if (comp_input == 0 & num_val == 0){
                computer += 0;
                human += 0;
            }
            else if (comp_input == 1 & num_val == 1){
                computer += 0;
                human += 0;
            }
            else if (comp_input == 2 & num_val == 2){
                computer += 0;
                human += 0;
            }                         
            else if (comp_input == 1 & num_val == 0){
                computer += 1;
                human += 0;                
            }
            else if (comp_input == 2 & num_val == 0){
                computer += 0;
                human += 1;  
            }
            else if (comp_input == 0 & num_val == 1){
                computer += 0;
                human += 1;  
            }
            else if (comp_input == 0 & num_val == 2){
                computer += 1;
                human += 0;  
            }
            else if (comp_input == 1 & num_val == 2){
                computer += 0;
                human += 1;  
            }
            else if (comp_input == 2 & num_val == 1){
                computer += 1;
                human += 0;  
            }
            
            if (human > computer){
                System.out.println("Round "+(i+1)+" Human won\n");
            }
            else if(human < computer){
                System.out.println("Round "+(i+1)+" Computer won\n");
            }
            else if (human == computer){
                System.out.println("Round "+(i+1)+" Tie\n");                
            }
            num_val *= 0;            
        }
        if (human > computer){
            System.out.println("Finnally: Human won");
        }
        else if (human < computer){
            System.out.println("Finnally: Computer won");
        }
        else{
            System.out.println("Finnally: Tie");                
        }                

        sc.close();
    }
}
