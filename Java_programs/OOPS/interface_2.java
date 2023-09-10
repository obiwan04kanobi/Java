
interface Camera{

    void takeSnap();
    void recordVideo();
    private  void greet(){
        System.out.println("Namaste !!");
    }

    //default methods in interfaces are used to define the methods itself in interfaces so that we don't have to implement the same method in every class that implements this interface
    default void record4Kvideo(){
        greet();
        System.out.println("Recording 4K video...");
    }
}

interface Wifi{

    String [] getNetworks();
    void connectoNetwork(String network);
}

class Phone{

    public void callNumbers(int Phonenumber){
        System.out.println("Calling..."+Phonenumber);
    }

    public void Pickcall(){
        System.out.println("Connecting...");
    }

}

class SmartPhone extends Phone implements Camera,Wifi{


    //this method overrides the same method in Camera interface. 
    //If we remove this method then by default the same method defined in the interface will be called. Otherwise, if we override a method of interface in one of the class that implements it then that class's method will be called by default.
    @Override
    public void record4Kvideo(){
        System.out.println("Taking Snap and Recording 4K video...");
    }


    public String [] getNetworks(){
        System.out.println("Getting list of Networks");
        String [] network_list = {"harry, prashant,Anjali5G"};
        return network_list;
    }

    public void connectoNetwork(String network){
        System.out.println("Connecting to.."+ network);
    }

    public void takeSnap(){
        System.out.println("Taking snap....");
    }

    public void recordVideo(){
        System.out.println("Recording video...");
    }

}

public class interface_2 {
    public static void main(String[] args) {
            
            SmartPhone sm = new SmartPhone();
            
            sm.record4Kvideo();
            
            String[] ar = sm.getNetworks();
            for (String item: ar) {
                System.out.println(item);
            
            //sm.greet(); //will throw an error because private method and cannot be accessed directly

        }
    }
}