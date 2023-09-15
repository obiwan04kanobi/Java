
interface Bicycle{
    int a = 45;
    void applyBrake(int Decrement);
    void speedUp(int incerement);
}

interface blowHorn{
    void blow_vehicle_Horn();
}

class Hero_cycle implements Bicycle,blowHorn{

    //child class which is inheriting interfaces need to have it's methods set to public

    public int speed = 7;
    
    public void applyBrake(int Decrement){
        speed -= Decrement;
        System.out.println("Bicycle Speed Decreased to: "+speed);
    }

    public void speedUp(int incerement){
        speed += incerement;
        System.out.println("Bicycle Speed Incereased to: "+speed);
    }

    public void blow_vehicle_Horn(){
        System.out.println("honk honk ...");
    }

}

public class interface_1 {
    public static void main(String[] args) {
        Hero_cycle cy = new Hero_cycle();
        cy.applyBrake(4);
        cy.speedUp(2);

        //you can create properties in interfaces. You cannot modify the properties in interfaces because they are final
        //System.out.println(cy.a);
        cy.blow_vehicle_Horn();
    }
}
