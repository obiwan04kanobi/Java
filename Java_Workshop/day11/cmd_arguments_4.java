package day11;

public class cmd_arguments_4 {
    public static void main(String[] args) {
        
        int size = args.length; 

        int arr[] = new int[size];

        int max = arr[0];

        for (int i =0;i<size;i++){
            
            arr[i] = Integer.parseInt(args[i]);
        }

        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Greatest number is: "+max);


    }
}
