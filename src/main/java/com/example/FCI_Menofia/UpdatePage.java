package com.example.FCI_Menofia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.example.FCI_Menofia.student.StudentInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UpdatePage {

    @FXML
    private Button backToMainPageButton;

    @FXML
    private TextField nationalIdTextField;

    @FXML
    private Button getStudentInfo;

    @FXML
    private TextField studentCourse1TextField;

    @FXML
    private TextField studentCourse2TextField;

    @FXML
    private TextField studentCourse3TextField;

    @FXML
    private TextField studentCourse4TextField;

    @FXML
    private TextField studentCourse5TextField;

    @FXML
    private TextField studentCourse6TextField;

    @FXML
    private TextField studentDepartmentTextField;

    @FXML
    private TextField studentJpaTextField;

    @FXML
    private TextField studentLevelTextField;

    @FXML
    private TextField studentNameTextField;

    @FXML
    private TextField studentSectionTextField;

    @FXML
    private Button updateInfoButton;

    StudentInfo studentObj=new StudentInfo();

    @FXML
    void backToMainPage(ActionEvent event) {
    new CustomFunctions().gotToScene(updateInfoButton,"mainPage.fxml");
    }

    public String studentName;
    public String nationalId;
    public double studentJPA;
    public String studentSection;
    public String studentLevel;
    public String studentDepartment;
    public String studentCourse1;
    public String studentCourse2;
    public String studentCourse3;
    public String studentCourse4;
    public String studentCourse5;
    public String studentCourse6;
    HashMap<String,String>studentDataInMap=new HashMap<>();

    // function that used to convert resultSet to map ->
    private HashMap<String, List<Object>> resultSetToArrayList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        HashMap<String, List<Object>> map = new HashMap<>(columns);
        for (int i = 1; i <= columns; ++i) {
            map.put(md.getColumnName(i), new ArrayList<>());
        }
        while (rs.next()) {
            for (int i = 1; i <= columns; ++i) {
                map.get(md.getColumnName(i)).add(rs.getObject(i));
            }
        }

        return map;
    }


    @FXML
    void getStudentInfoFromDatabase(ActionEvent event) {
        ResultSet resultSet=null;
        Connection connection;
        try{
            String nationalId=nationalIdTextField.getText();
             connection=DBconnector.getconnection();
            Statement stmt=connection.createStatement();
             resultSet=stmt.executeQuery("select * from studentsdatabase.studentsinfo where nationalid = "+nationalId+";");
            //TODO need to get data from result set and convert it with any datatype to be able to work on with

             System.out.println("********************************");
            System.out.println("********************************");
            //studentDataInMap=resultSetToArrayList(resultSet);
            System.out.println(studentDataInMap);
            System.out.println("********************************");
            System.out.println("********************************");
             System.out.println("ResultSet After execution -> "+resultSet);
        }catch (Exception e){
            System.out.println("Error done while Connecting with database in Update page !!");
        }
try {
    System.out.println("Resultset in printing statement in name field -> "+resultSet);
    studentName=resultSet.getString("NAME");
    System.out.println(studentName);
}catch (Exception e){
    System.out.println("error while getting name from database in Update Page #");
}


          try {
              studentLevelTextField.setText(resultSet.getString("LEVEL"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student Level info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("department"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student department info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("section"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student section info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("jpa"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student jpa info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("course1"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student course1 info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("course2"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student course2 info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("course3"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student course3 info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("course4"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student course4 info from database in update page");
          }


          try {
              studentLevelTextField.setText(resultSet.getString("course5"));
          } catch (SQLException e) {
              System.out.println("Error while getting Student course5 info from database in update page");
          }

        try {
            studentLevelTextField.setText(resultSet.getString("course6"));
        } catch (SQLException e) {
            System.out.println("Error while getting Student course6 info from database in update page");
        }
    }

    @FXML
    void updateStudentInfo(ActionEvent event) {

    }

}
