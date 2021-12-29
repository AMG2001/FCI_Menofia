package com.example.FCI_Menofia;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;




public class DisplayStudents  implements Initializable {

private String url="jdbc:mysql://localhost/studentsdatabase";
private String ResourceBundle="resources";
    @FXML
    private Button backToMainPage;
    @FXML
    private TableColumn<modeltabel, String> course1;

    @FXML
    private TableColumn<modeltabel, String> course2;

    @FXML
    private TableColumn<modeltabel, String> course3;

    @FXML
    private TextField nationalIdForDelete;

    @FXML
    private TableColumn<modeltabel, String> course4;

    @FXML
    private TableColumn<modeltabel, String> course5;

    @FXML
    private TableColumn<modeltabel, String> course6;

    @FXML
    private TableColumn<modeltabel, String> department;

    @FXML
    private TableColumn<modeltabel, String> jpa;

    @FXML
    private TableColumn<modeltabel, String> level;

    @FXML
    private TableColumn<modeltabel, String> name;

    @FXML
    private TableColumn<modeltabel, String> section;

    @FXML
    private TableColumn<modeltabel, String> nationalid;

    @FXML
    private TableView<modeltabel> tabel;

    @FXML
    private Button delbutton;

    ObservableList<modeltabel> oblist = FXCollections.observableArrayList();

    public void displayStudents(){ // Function to display all student in table
        try{
            tabel.getItems().clear(); // function that used to clear the content of the table
            Connection con=DBconnector.getconnection();
            System.out.println("Connection with database done  ## in display page");
            ResultSet rs=con.createStatement().executeQuery("select * from studentsdatabase.studentsinfo;");
            System.out.println("SetResults done ##");
            while (rs.next()){
                oblist.add(new modeltabel(rs.getString("name"),rs.getString("level"),rs.getString("department"),rs.getString("section"),rs.getString("jpa"),rs.getString("course1"),rs.getString("course2"),rs.getString("course3"),rs.getString("course4"),rs.getString("course5"),rs.getString("course6"),rs.getString("nationalid")));
            }
            con.close();
        }catch (Exception e){
            System.out.println("Error while connecting with database in display page");
        }

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        level.setCellValueFactory(new PropertyValueFactory<>("level"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
        section.setCellValueFactory(new PropertyValueFactory<>("section"));
        jpa.setCellValueFactory(new PropertyValueFactory<>("jpa"));
        course1.setCellValueFactory(new PropertyValueFactory<>("course1"));
        course2.setCellValueFactory(new PropertyValueFactory<>("course2"));
        course3.setCellValueFactory(new PropertyValueFactory<>("course3"));
        course4.setCellValueFactory(new PropertyValueFactory<>("course4"));
        course5.setCellValueFactory(new PropertyValueFactory<>("course5"));
        course6.setCellValueFactory(new PropertyValueFactory<>("course6"));
        nationalid.setCellValueFactory(new PropertyValueFactory<>("nationalid"));

        tabel.setItems(oblist);
    }
    public void initialize(URL location, ResourceBundle resources) {
        displayStudents();
    }

    @FXML
    void backToMainPage(ActionEvent event) {
new CustomFunctions().gotToScene(backToMainPage,"mainPage.fxml");
    }
    modeltabel m=new modeltabel();


    @FXML
    void deleteStudentFromDatabase(ActionEvent event) {
String nationalId=nationalIdForDelete.getText();
String deletingStudentSqlCommand="Delete from studentsdatabase.studentsinfo where nationalid = "+nationalId+";";
        try{
            Connection con=DBconnector.getconnection();
            System.out.println("Connection with database done  ## in display page");
            Statement stmt=con.createStatement();
           try{
               stmt.execute(deletingStudentSqlCommand);
               displayStudents();
           }catch (Exception e){
               System.out.println("Entered value is not allowed !! ");
           }
        }catch (Exception e){
            System.out.println("Error in db while deleting student !!");
        }
    }

}
