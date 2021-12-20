package databases;
import java.sql.*;
public class StudentsDataBase {
    static String user="root"; // is the user that we tought before
    static String password=""; // is the password that created for
    static String host="jdbc:mysql://localhost/studentsdatabase"; // localhost/db_name
    static Connection c; // object to connect with the driver .
public StudentsDataBase(){
    try{
        c=DriverManager.getConnection(host,user,password); // it always throw exception
        System.out.println("Connection with Students Database Done ## ");
    }catch(Exception e){
        System.out.println("There is an error while Connection with students database !!");
    }
}
public void createTableStudentDataBase(){

}
}
