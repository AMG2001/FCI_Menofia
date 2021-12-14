package com.example.FCI_Menofia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import student.StudentInfo;

public class InsertPage {
StudentInfo student=new StudentInfo();
    @FXML
    private RadioButton BioRadioButton;

    @FXML
    private RadioButton CsRadioButton;

    @FXML
    private Button DoneButton;

    @FXML
    private RadioButton IsRadioButton;

    @FXML
    private RadioButton ItRadioButton;

    @FXML
    private RadioButton OrRadioButton;

    @FXML
    private RadioButton OtherRadioButton;

    @FXML
    private RadioButton SeRadioButton;

    @FXML
    private Button Term1Button;

    @FXML
    private Button Term2Button;

    @FXML
    private ToggleGroup departmentToggleGroup;

    @FXML
    private TextField jpaTextField;

    @FXML
    private RadioButton level1RadioButton;

    @FXML
    private RadioButton level2RadioButton;

    @FXML
    private RadioButton level3RadioButton;

    @FXML
    private RadioButton level4RadioButton;

    @FXML
    private ToggleGroup levelsButtonsToggleGroup;

    @FXML
    private TextField nationalIdTextField;

    @FXML
    private TextField sectionTextField;

    @FXML
    private TextField studentNameTextField;

Scene loginPageScene;

    @FXML
    void done(ActionEvent event) {
        if(level1RadioButton.isSelected()){
            student.studentLevel="Level 1";
        }
        if(level2RadioButton.isSelected()){
            student.studentLevel="Level 2";
        }
        if(level3RadioButton.isSelected()){
            student.studentLevel="Level 3";
        }
        if(level4RadioButton.isSelected()){
            student.studentLevel="Level 4";
        }

       new CustomFunctions().showScene(DoneButton,"loginPage.fxml");



//        student.studentName=studentNameTextField.getText();
//        student.nationalId=nationalIdTextField.getText();
//        student.studentJPA= Double.parseDouble(jpaTextField.getText());
//        student.studentSection=sectionTextField.getText();
//        System.out.println(student.studentName);
//        System.out.println(student.nationalId);
//        System.out.println(student.studentJPA);
//        System.out.println(student.studentSection);
//        System.out.println(student.studentLevel);

        //System.out.println(student.studentDepartment);
    }



}
