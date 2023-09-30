
package javaapplication1;

import java.sql.*;
public class Mysql {

    public static void main(String[] args) {
        try{
            String url= "jdbc:mysql://localhost:3306/db";
            String uname = "root";
            String pass = "root";
            //String query = "select *from mytable";
            String query = "select name from mytable where age = 19";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
/*             while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: "+name+", Age: "+age);
            }
*/
            //to print only one name
            rs.next();
            String name = rs.getString("name");
            System.out.println(name);

            //to print all names with age 19
/*             while(rs.next()){
            String name = rs.getString("name");
            System.out.println(name);
            } 
*/
            st.close();
            con.close();
            //System.out.println(con);
        }
        catch(Exception e){

        }
 
    }
    
}
