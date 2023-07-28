// PRIMITIVE DATA TYPES


public class literals {
    public static void main(String[] args) {
        // in case of integers (like byte,int,short..etc) the compiler already knows what that data type is when the correct integer keyword is used.

        byte age = 34;  
        int age2 = 56;
        long num = 6755678909876l;  //need to tell the compiler that it is "long" number with using "l" or "L" at the end.
        char ch = 'A'; // need to tell the compiler that it is a "char" by using single quotes ('')
        float f1 = 5.6f; //need to tell the compiler that it is "float" number with using "f" or "F" at the end. Otherwise it will default to "double".
        double d1 = 5.6; // no need to tell the compiler that it is a "double", it knows by default.
        
        System.out.println(age);
        System.out.println(age2);
        System.out.print(num);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
    }
}
