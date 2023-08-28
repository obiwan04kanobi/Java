public class no_paramater_constructor_2 {

    String name;
    int r_no;
    int age;

    //No-Parameter constructor (does not take any arguments)
    no_paramater_constructor_2(){

        name = "James Gosling";
        r_no = 123;
        age = 69;

    }

    public static void main(String[] args) {

        no_paramater_constructor_2 np = new no_paramater_constructor_2();
        
        System.out.printf("Author name: %s, Roll No: %d, Age: %d",np.name,np.r_no,np.age);


    }
}
