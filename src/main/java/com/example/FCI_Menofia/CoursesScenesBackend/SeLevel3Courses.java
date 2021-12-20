package com.example.FCI_Menofia.CoursesScenesBackend;

import com.example.FCI_Menofia.CustomFunctions;
import com.example.FCI_Menofia.InsertPage;
import databases.StudentsDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class SeLevel3Courses {
InsertPage insertPageObj=new InsertPage();
    String algorithmCheckBoxCurrentState="unChecked";
    String aiCheckBoxCurrentState="unChecked";
    String cloudComputingCheckBoxCurrentState="unChecked";
    String programming3CheckBoxCurrentState="unChecked";
    String se2CheckBoxCurrentState="unChecked";
    String os2CheckBoxCurrentState="unChecked";
    String course1;
    String course2;
    String course3;
        String course4;
        String course5;
        String course6;

    @FXML
    private Button insertStudentIntoDBButton;

    @FXML
    private CheckBox AlgorithmsCheckBox;

    @FXML
    private CheckBox artificialIntellegenceCheckBox;

    @FXML
    private CheckBox cloudComputingCheckBox;

    @FXML
    private CheckBox operatingSystem2CheckBox;

    @FXML
    private CheckBox programming3CheckBox;

    @FXML
    private CheckBox softwareEngineering2CheckBox;
/*
*
* Algorithms CheckBox ->
*
 */
    @FXML
    void AlgorithmsCheckBoxChecked(ActionEvent event) {
if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&algorithmCheckBoxCurrentState=="unChecked"){
   algorithmCheckBoxCurrentState="checked";
   course1="Algorithms";
    insertPageObj.coursesCounter++;
}else if(algorithmCheckBoxCurrentState=="checked"){
    algorithmCheckBoxCurrentState="unChecked";
    AlgorithmsCheckBox.setSelected(false);
    course1="";
    insertPageObj.coursesCounter--;
}
else{
    System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
    AlgorithmsCheckBox.setSelected(false);
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Choosing Courses Error !");
    alert.setHeaderText("Extra Courses added !!");
    alert.setContentText("you can't add More Courses for this student Depending on his GPA");
    alert.showAndWait();
}
    }
/*
*
* AI CheckBox ->
*
*
 */
    @FXML
    void artificialIntellegenceCheckBoxChecked(ActionEvent event) {
        if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&aiCheckBoxCurrentState=="unChecked"){
            aiCheckBoxCurrentState="checked";
            course2="Artificail Intellegence";
            insertPageObj.coursesCounter++;
        }else if(aiCheckBoxCurrentState=="checked"){
            algorithmCheckBoxCurrentState="unChecked";
            AlgorithmsCheckBox.setSelected(false);
            course2="";
            insertPageObj.coursesCounter--;
        }
        else{
            System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
            artificialIntellegenceCheckBox.setSelected(false);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choosing Courses Error !");
            alert.setHeaderText("Extra Courses added !!");
            alert.setContentText("you can't add More Courses for this student Depending on his GPA");
            alert.showAndWait();
        }
    }
/*
*
* Cloud Computing CheckBox ->
*
 */
    @FXML
    void cloudComputingCheckBoxChecked(ActionEvent event) {
        if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&cloudComputingCheckBoxCurrentState=="unChecked"){
            cloudComputingCheckBoxCurrentState="checked";
            course3="Cloud Computing";
            insertPageObj.coursesCounter++;
        }else if(cloudComputingCheckBoxCurrentState=="checked"){
            cloudComputingCheckBoxCurrentState="unChecked";
            cloudComputingCheckBox.setSelected(false);
            course3="";
            insertPageObj.coursesCounter--;
        }
        else{
            System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
            cloudComputingCheckBox.setSelected(false);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choosing Courses Error !");
            alert.setHeaderText("Extra Courses added !!");
            alert.setContentText("you can't add More Courses for this student Depending on his GPA");
            alert.showAndWait();
        }
    }
/*
*
* os2 CheckBox ->
*
 */
    @FXML
    void operatingSystem2CheckBoxChecked(ActionEvent event) {
        if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&os2CheckBoxCurrentState=="unChecked"){
            os2CheckBoxCurrentState="checked";
            course4="Operating System2";
            insertPageObj.coursesCounter++;
        }else if(os2CheckBoxCurrentState=="checked"){
            os2CheckBoxCurrentState="unChecked";
            operatingSystem2CheckBox.setSelected(false);
            course4="";
            insertPageObj.coursesCounter--;
        }
        else{
            System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
            operatingSystem2CheckBox.setSelected(false);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choosing Courses Error !");
            alert.setHeaderText("Extra Courses added !!");
            alert.setContentText("you can't add More Courses for this student Depending on his GPA");
            alert.showAndWait();
        }
    }
/*
*
* programming 3 CheckBox ->
*
 */
    @FXML
    void programming3CheckBoxChecked(ActionEvent event) {
        if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&programming3CheckBoxCurrentState=="unChecked"){
            programming3CheckBoxCurrentState="checked";
            course5="Programming 3";
            insertPageObj.coursesCounter++;
        }else if(programming3CheckBoxCurrentState=="checked"){
            programming3CheckBoxCurrentState="unChecked";
            programming3CheckBox.setSelected(false);
            course5="";
            insertPageObj.coursesCounter--;
        }
        else{
            System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
            programming3CheckBox.setSelected(false);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choosing Courses Error !");
            alert.setHeaderText("Extra Courses added !!");
            alert.setContentText("you can't add More Courses for this student Depending on his GPA");
            alert.showAndWait();
        }
    }
/*
*
*
* SE-2 CheckBox ->
*
 */
    @FXML
    void softwareEngineering2CheckBoxChecked(ActionEvent event) {
        if(insertPageObj.availableCoursesForStudent>insertPageObj.coursesCounter&&se2CheckBoxCurrentState=="unChecked"){
            se2CheckBoxCurrentState="checked";
            course6="Software Engineering 2";
            insertPageObj.coursesCounter++;
        }else if(se2CheckBoxCurrentState=="checked"){
            se2CheckBoxCurrentState="unChecked";
            softwareEngineering2CheckBox.setSelected(false);
            course6="";
            insertPageObj.coursesCounter--;
        }
        else{
            System.out.println("Avilable Courses = "+insertPageObj.availableCoursesForStudent+"and Choosen Courses = "+insertPageObj.coursesCounter);
            softwareEngineering2CheckBox.setSelected(false);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choosing Courses Error !");
            alert.setHeaderText("Extra Courses added !!");
            alert.setContentText("you can't add More Courses for this student Depending on his GPA");
            alert.showAndWait();
        }
    }

    @FXML
    void addStudentToDB(ActionEvent event) {
insertPageObj.getStudentCourses(course1,course2,course3,course4,course5,course6);
       insertPageObj.displayCourses();
       try{

           new StudentsDataBase().insertNewStudentIntoStudentDataBase(insertPageObj.getStudentInfoToBeInsertedInDataBase());
       }catch (Exception e){
           System.out.println("Error while insertring student inside the database");
       }
       try{
            new CustomFunctions().gotToScene(insertStudentIntoDBButton,"insertPage.fxml");
        }catch (Exception e){
            System.out.println("Error when moving from Courses page to insert Page !! ");
        }
          insertPageObj.setInsertPageEmpty();
    }

}
