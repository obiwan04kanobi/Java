
class employee_2{
    //Method overloading also works with constructors
    String name; int employee_id;
    public employee_2(String n){

        name = n;
        employee_id = 1434;

    }
}

public class constructor {
    public static void main(String[] args) {
        employee_2 emp = new employee_2("Harry");

        System.out.println(emp.name);
        System.out.println(emp.employee_id);
    }
}
