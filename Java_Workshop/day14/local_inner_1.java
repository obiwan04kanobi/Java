package day14;
/* 
 * Local Inner is basically Inner class inside a method of outer class
 */
class Local{

    final int s = 10;
    
    void show(){
        class Local_nested{
            void disp(){
                System.out.println("Students don't sleep");
            }
        }
        //creating a object of nested-inner class inside outer class method
        Local_nested l = new Local_nested();
        l.disp();
        
    }
}

public class local_inner_1 {
    public static void main(String[] args) {
    
        Local obj = new Local();
        System.out.println(obj.s);
        obj.show();

    }
}
