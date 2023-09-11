package day14;
/*
 * write a java code to print sum of even numbers using local inner class
*/

import java.util.Scanner;

class Outer_3{

    void display_3(){
        class Inner_3{
            void show_3(array[],int size){
                int sum = 0;
                for (int i = 0;i<=size;i++){

                    if (array[i] % 2 == 0){
                        sum += array[i];
                    } 
                }
            }
        }
        Inner_3 obj = new Inner_3();
        obj.show_3();        
    }

}



public class local_inner_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int array[]  = new int[size];
        for (int i = 0;i<=size;i++){
            System.out.print("Enter Num "+i+": ");
            array[i] = sc.nextInt();
        }

        Outer_3 o = new Outer_3();
        o.display_3();
    }
}
