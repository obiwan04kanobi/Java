public class nested_for_loop2 {
    public static void main(String[] args) {
        for(int i=1; i <=3;i++){
            
            if(i==2){
                continue; // with continue prints 2 times with break only 1 time
            }
            else{
                System.out.println("Hello Listen !!!");
            }
        }
    }
}
