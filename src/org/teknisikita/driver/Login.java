/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.driver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author K A L I T
 */
public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/org/teknisikita/view/Login.fxml"));
        Scene scene = new Scene(parent, 279, 295);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
         
        
        
    }
}
