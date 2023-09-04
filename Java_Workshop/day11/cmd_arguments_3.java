package day11;

public class cmd_arguments_3 {
    public static void main(String[] args) {
        for (int i =0;i<args.length;i++){
            int n = Integer.parseInt(args[i]);
            System.out.println(n);
        }
    }
}
