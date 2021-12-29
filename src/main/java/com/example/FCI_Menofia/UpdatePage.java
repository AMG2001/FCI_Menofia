package com.example.FCI_Menofia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import student.StudentInfo;

import java.sql.*;

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

    @FXML
    void getStudentInfoFromDatabase(ActionEvent event) {
        ResultSet resultSet=null;
        Connection connection;
        try{
            String nationalId=nationalIdTextField.getText();
             connection=DBconnector.getconnection();
            Statement stmt=connection.createStatement();
             resultSet=stmt.executeQuery("select * from studentsdatabase.studentsinfo where nationalid = "+nationalId+";");
        }catch (Exception e){
            System.out.println("Error done while Connecting with database in Update page !!");
        }
try {
    System.out.println(resultSet.getString("NAME"));
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
