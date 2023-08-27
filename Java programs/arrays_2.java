public class arrays_2 {
    public static void main(String[] args) {
        int [] marks = {46,25,426,42,56,76};
        int n = marks.length;
        System.out.printf("No. of elemenst in this array are %d\n",n);

        System.out.println("Printing elements in the array using for loop");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing elements of the array in reverse order");
        for(int i=n-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        System.out.println("Printing elements of the array using for-each loop method");
        for(int elements: marks){
            System.out.println(elements);
        }


    }
}
