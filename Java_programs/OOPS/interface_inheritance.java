
interface sampleInterface{
    void meth1();
    void meth2();
}

//Interface ChildSampleInterface inherits sampleInterface 
interface ChildSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

//class SampleClass implements ChildSampleInterface
class SampleClass implements ChildSampleInterface{
    public void meth1(){
        System.out.println("Meth 1");
    }
    
    public void meth2(){
        System.out.println("Meth 2");
    }

    public void meth3(){
        System.out.println("Meth 3");
    }
    
    public void meth4(){
        System.out.println("Meth 4");
    }
}


public class interface_inheritance {
    public static void main(String[] args) {
        SampleClass sp = new SampleClass();
        sp.meth1();
        sp.meth2();
        sp.meth3();
        sp.meth4();                
    }
}
