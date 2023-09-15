package Java_programs.packages.demo_2;
import Java_programs.packages.demo_1.*;

public class checking_status {
    public static void main(String[] args) {
        
        //creating object of Whatsapp class after importing it.
        Whatsapp check_status = new Whatsapp();
        
        check_status.status();
        System.out.println(check_status.notification());
    }    
}
