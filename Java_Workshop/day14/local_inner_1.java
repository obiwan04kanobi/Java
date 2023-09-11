package day14;

class Local{

    final int s = 10;
    
    void show(){
        class Local_nested{
            void disp(){
                System.out.println("Students don't sleep");
            }
        }
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
