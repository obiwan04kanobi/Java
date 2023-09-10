
interface Vehicle{
    void wheels();
    void engine();
}

interface TataNexon extends Vehicle{

    //extra method
    default void Tata_features(){
        System.out.println("Tata Nexon has Electronic Stability Program");
        System.out.println("Tata Nexon has Multi Drive Modes");
    }
}

interface HyundaiVenue extends Vehicle{

    //extra method
    default void Hyundai_features(){
        System.out.println("Hyundai Venue has Smart Connect technology");
        System.out.println("Hyundai Venue has Intelligent Manual Transmission");
    }

}

class MyCar implements TataNexon,HyundaiVenue{

    public void wheels(){
        System.out.println("My Car has 4 wheels");
    }

    public void engine(){
        System.out.println("My Car has 1200 CC engine");
    }     


}

public class polymorphism {
    public static void main(String[] args) {

        //refrence is TataNexon and object is of MyCar
        TataNexon tn = new MyCar();
        
        //refrence is TataNexon and object is of MyCar
        HyundaiVenue hv = new MyCar();

        tn.wheels();
        tn.engine();
        tn.Tata_features();
        //tn.Hyundai_features(); //Tata Nexon is the reference so it can only access methods in MyCar and Tata Nexon

        hv.wheels();
        hv.engine();
        hv.Hyundai_features();
        //hv.Tata_features(); //Hyundai Venue is the reference so it can only access methods in MyCar and Hyundai Venue


    }
}
