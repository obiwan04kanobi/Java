import java.util.Scanner;

class MaxRetrieveException extends Exception{
    @Override
    public String toString(){
        return "Bro, you're Stupid !!";
    }
}

class MaxRetrieveException_2 {
    
    void print() throws IndexOutOfBoundsException
    {
        throw new IndexOutOfBoundsException("Bro, you're Stupid !!");
    }
}

public class pset_14{
    public static void main(String[] args) {
        
        //problem 3

        int [] array = {34,21,44,51,64};
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (flag && i <5) {
            
            try {
                System.out.println("Enter index: ");
                int index = sc.nextInt();
                System.out.println("Number at index "+index+" is "+array[index]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
                if (i>=5){

                    //using throw
                    try{
                        throw new MaxRetrieveException();
                    }
                    catch(MaxRetrieveException m){
                        System.out.println(m.toString());
                    }

                    //using throws
                    try{
                        MaxRetrieveException_2 m = new MaxRetrieveException_2();
                        m.print();
                    }
                    catch(IndexOutOfBoundsException m){
                        System.out.println(m.getMessage());
                    }
                }
            }
        }
        sc.close();
    }
}
