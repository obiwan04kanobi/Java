package day4;
public class dog {

    String breed;
    String size;
    int age;
    String color;

    public static void main(String[] args) {
        // instance variable

        dog maltese = new dog();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "White";
        System.out.println(maltese.getinfo());
    }

        // method 1
        public String getinfo(){
            return("Breed is: "+breed+" \nSize is: "+size+" \nAge is: "+age+" \ncolor is: "+color);
        } 
}
