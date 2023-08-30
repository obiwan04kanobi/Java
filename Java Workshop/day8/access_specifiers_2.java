package day8;

// PRIVATE ACCESS SPECIFIERS
class data{

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
    
        data d = new data();
        d.setName("Java");
        System.out.println(d.get_Name());
    }
}
