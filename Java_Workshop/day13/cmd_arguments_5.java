package day13;

// ENTER "N" NUMBERS AS COMMAND LINE ARGUMENTS AND PRINT THEM WITH ALTERNATIVE SIGNS, LIKE +1 -2 +3 -4 .....

public class cmd_arguments_5 {
    public static void main(String[] args) {

        if (args.length == 0) {
            return;
        }

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (i % 2 == 0) {
                System.out.print("+" + num);
            } else {
                System.out.print("-" + num);
            }

            if (i < args.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
