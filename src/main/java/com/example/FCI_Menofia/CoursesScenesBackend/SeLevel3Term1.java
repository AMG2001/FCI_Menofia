package com.example.FCI_Menofia.CoursesScenesBackend;

import com.example.FCI_Menofia.InsertPage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;

public class SeLevel3Term1 {
InsertPage insertPageObj=new InsertPage();
    String algorithmCheckBoxCurrentState="unChecked";
    String aiCheckBoxCurrentState="unChecked";
    String cloudComputingCheckBoxCurrentState="unChecked";
    String programming3CheckBoxCurrentState="unChecked";
    String se2CheckBoxCurrentState="unChecked";
    String os2CheckBoxCurrentState="unChecked";
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
    insertPageObj.coursesCounter++;
}else if(algorithmCheckBoxCurrentState=="checked"){
    algorithmCheckBoxCurrentState="unChecked";
    AlgorithmsCheckBox.setSelected(false);
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
            insertPageObj.coursesCounter++;
        }else if(aiCheckBoxCurrentState=="checked"){
            algorithmCheckBoxCurrentState="unChecked";
            AlgorithmsCheckBox.setSelected(false);
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
            insertPageObj.coursesCounter++;
        }else if(cloudComputingCheckBoxCurrentState=="checked"){
            cloudComputingCheckBoxCurrentState="unChecked";
            cloudComputingCheckBox.setSelected(false);
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
            insertPageObj.coursesCounter++;
        }else if(os2CheckBoxCurrentState=="checked"){
            os2CheckBoxCurrentState="unChecked";
            operatingSystem2CheckBox.setSelected(false);
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
            insertPageObj.coursesCounter++;
        }else if(programming3CheckBoxCurrentState=="checked"){
            programming3CheckBoxCurrentState="unChecked";
            programming3CheckBox.setSelected(false);
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
            insertPageObj.coursesCounter++;
        }else if(se2CheckBoxCurrentState=="checked"){
            se2CheckBoxCurrentState="unChecked";
            softwareEngineering2CheckBox.setSelected(false);
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

}
