package day12;

interface marker{

    //empty body because marker interface
    //it's more secure. eg, could be used in databases
}

class mayank_1 implements marker{

    public void show(){
        System.out.println("It's working fine");
    }
}

public class markup_interface {
    public static void main(String[] args) {
        mayank_1 a = new mayank_1();
        if (a instanceof marker){
            a.show();
        }
        else{
            System.out.println("Not a marker interface");
        }        
    }
}
