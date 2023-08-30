package day8;

// PRIVATE ACCESS SPECIFIERS
class data_1{

    private String name;
    public String get_Name(){

        return this.name;

    }

    public void setName(String name){

        this.name = name;
    }
}

public class access_specifiers_2 {
    public static void main(String[] args) {
    
        data_1 d = new data_1();
        d.setName("Java");
        System.out.println(d.get_Name());
    }
}
