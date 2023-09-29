package day25;

public class Mytest2 {
    public char check(int grade){
        if(grade<0){
            throw new IllegalArgumentException("Grade cannot be negative");
        }
        else if(grade<60){
            return 'F';
        }
        else if(grade<70){
            return 'D';
        }
        else if(grade<80){
            return 'C';
        }
        else if(grade<90){
            return 'B';
        }
        else{
            return 'A';
        }
    }
}
