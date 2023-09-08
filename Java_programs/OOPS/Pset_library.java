import java.util.Scanner;

class library{

    Scanner sc = new Scanner(System.in);
    public int library_size = 6;
    String [] names;
    int issue_no;

    void book_name(){
        names = new String[library_size];
        

        for(int i =1;i < library_size;i++){

            System.out.println("Book No. "+i+" Name: ");
            names[i] = sc.nextLine();

        }

    }

    void show_available_books(){  

        System.out.println("Available book in library");

        for(int i =1;i < library_size;i++){
            
            System.out.println(i+" "+names[i]);
        }
    }
    
    void issue_book(){
        System.out.println("Enter book no. to issue");
        issue_no = sc.nextInt();
        
        if (issue_no < library_size)
        {            
            System.out.println("Book Issued");
            System.out.println("Name: "+names[issue_no]+"Book No.: "+issue_no);
        }
        else{
            System.out.println("No, Book with the given Book No. Available");
        }
    }

    void return_book(){
        System.out.println("Enter book no. to return");
        issue_no = sc.nextInt();  
        
        if (issue_no < library_size)
        {            
            System.out.println("Book Returned");
            System.out.println("Name: "+names[issue_no]+"Book No.: "+issue_no);
        }
        else{
            System.out.println("No, Book with the given Book No. Available");
        }        
    }

}



public class Pset_library {
    public static void main(String[] args) {
        library lib = new library();

        lib.book_name();
        lib.show_available_books();
        lib.issue_book();
        lib.return_book();
    }
}
