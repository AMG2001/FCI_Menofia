package databases;
import student.StudentInfo;

import java.sql.*;
public class StudentsDataBase {
    static String user="root"; // is the user that we tought before
    static String password=""; // is the password that created for
    static String host="jdbc:mysql://localhost/studentsdatabase"; // localhost/db_name
    static Connection connectionObj; // object to connect with the driver .
public StudentsDataBase(){
    try{
        connectionObj=DriverManager.getConnection(host,user,password); // it always throw exception
        System.out.println("Connection with Students Database Done ## ");
//            Statement stmt = connectionObj.createStatement();
//        try{
//            String sqlCommnad = "CREATE TABLE STUDENTINFO " +
//                    "(id INTEGER not NULL AUTO_INCREMENT, " +
//                    " name TEXT " +
//                    " level TEXT " +
//                    "department TEXT"+
//                    "section TEXT " +
//                    "jpa DOUBLE"+
//                    "course1 TEXT"+
//                    "course2 TEXT"+
//                    "course3 TEXT"+
//                    "course4 TEXT"+
//                    "course5 TEXT"+
//                    "course6 TEXT"+
//                    "nationalid BIGINT "+
//                    "CONSTRAINT PK1 PRIMARY KEY (nationalid) ";
//            stmt.execute(sqlCommnad);
//            System.out.println("student table created successfully !!");
//        }catch (Exception e){
//            System.out.println("error done while creating student table");
//        }
//            connectionObj.close(); // close the connection with DB for security puproses .
        } catch(Exception e){
        System.out.println("There is an error while Connection with students database !!");
    }
}
/*
*
* insert student into database
*
 */
public void insertNewStudentIntoStudentDataBase(StudentInfo studentObj)throws  Exception{
    connectionObj=DriverManager.getConnection(host,user,password);
    System.out.println("Connection with Students Database Done ## ");
    Statement stmt = connectionObj.createStatement();
    String insetStudentSqlCommand="INSERT INTO studentsdatabase('name,level,department,jpa,section,course1,course2,course3,course4,course5,course6,nationalid') VALUES ("+studentObj.studentName+
            ", "+studentObj.studentLevel+
            ", "+studentObj.studentDepartment+
            ", "+studentObj.studentSection+
            ", "+studentObj.studentJPA+
            ", "+studentObj.studentCourse1+
            ", "+studentObj.studentCourse2+
            ", "+studentObj.studentCourse3+
            ", "+studentObj.studentCourse4+
            ", "+studentObj.studentCourse5+
            ", "+studentObj.studentCourse6+
            ", "+studentObj.nationalId+
            ";";
    stmt.execute(insetStudentSqlCommand);
}
}
