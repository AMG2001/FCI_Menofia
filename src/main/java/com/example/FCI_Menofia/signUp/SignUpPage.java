package com.example.FCI_Menofia.signUp;

import com.example.FCI_Menofia.CustomFunctions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpPage {

    @FXML
    private Button backToLoginPageButton;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private TextField employeeFirstNameTextField;

    @FXML
    private TextField employeeLastNameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    void backToLoginPageButtonFunction(ActionEvent event) {
new CustomFunctions().gotToScene(backToLoginPageButton,"loginPage.fxml");
    }

    @FXML
    void signUpButtonFunction(ActionEvent event) {

    }

}
