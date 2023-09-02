
class Employee{
    private int id;
    private String name;

// Setter sets the value and getter return the value
// Getter and Setter need to be implemented if we want to access values from private methods or properties.

    //setter
    public void setName(String n){
        name = n;
    }

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setId(int i){
        id = i;
    }

    //getter
    public int getId(){
        
        return id;
    }

}

public class private_method_2 {
    public static void main(String[] args) {
        
        Employee harry = new Employee();

        //harry.id = 143;
        //harry.name = "Harry";  ==> will throw an Error due private access modifier

        harry.setName("Harry");
        harry.setId(143);

        System.out.printf("Employee name is: %s, and Id: %d",harry.getName(),harry.getId());

    }
}
