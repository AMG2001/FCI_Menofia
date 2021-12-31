package com.example.FCI_Menofia;

import databases.StudentsDataBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    StudentsDataBase studentDatabaseObj=new StudentsDataBase();
    @Override
    public void start(Stage stage){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../../../login/signUp/loginpage.fxml"));
           Scene scene = new Scene(fxmlLoader.load(),800,600);
           stage.setTitle("Insert New Student..");
           stage.setScene(scene);
           stage.show();
       }catch (Exception e){
           System.out.println("Error while starting the app in FX");
       }
    }

    public static void main(String[] args) {
        launch(args);
    }
}