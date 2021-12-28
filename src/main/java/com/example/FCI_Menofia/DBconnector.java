package com.example.FCI_Menofia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnector  {
    public static Connection getconnection() throws Exception{
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/studentsdatabase","root","");
        return connection;
    }

    public static boolean runNonQuery(String strdelete) {
        boolean flag=true;
        try{
            Connection con=DBconnector.getconnection();
            System.out.println("Connection with database done  ## in display page");
           Statement stmt=con.createStatement();
           stmt.executeQuery(strdelete);
           flag=true;
        }catch (Exception e){
            System.out.println("Error inside DBConnector class runNonQuery Function");
            flag=false;
        }
        return  flag;
    }
}
