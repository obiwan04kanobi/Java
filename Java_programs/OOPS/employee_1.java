
class employee_stats{

    int salary;
    String name;

    void set_salary(int sal){

        salary = sal;

    }

    int get_salary(){
        return salary;
    }

    public void setName(String n){

        name = n;
    }

    String getName(){

        return name;
    }

}


public class employee_1{
    public static void main(String[] args) {
        
        employee_stats emp = new employee_stats();

        emp.setName("Harry");
        emp.set_salary(1000000);
        System.out.printf("\nName of Emp: %s and Salary is %d",emp.getName(),emp.get_salary());


    }
}