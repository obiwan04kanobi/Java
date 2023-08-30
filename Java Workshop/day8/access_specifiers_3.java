package day8;

// PROTECTED ACCESS SPECIFIERS
class Parent_1{

    protected void display (){
        System.out.println("Batch 2");
    }

}

class access_specifiers_3 extends Parent_1{
    public static void main(String[] args) {
        access_specifiers_3 c = new access_specifiers_3();
        c.display();
    }    
}
