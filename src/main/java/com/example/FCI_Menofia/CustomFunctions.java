package com.example.FCI_Menofia;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CustomFunctions {
    // used to show Scene that you want to Move For .
   public void showScene(Button btn, String fxmlFilePath){
        Parent root=null;
        try{
            root= FXMLLoader.load(getClass().getResource(fxmlFilePath));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        Stage window=(Stage)btn.getScene().getWindow();
        window.setScene(new Scene(root,800,600));
    }
}
