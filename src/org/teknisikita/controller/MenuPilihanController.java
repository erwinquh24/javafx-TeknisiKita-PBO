/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author K A L I T
 */
public class MenuPilihanController implements  Initializable{

     @FXML
    private StackPane acContent;
    
    @FXML
    public void pilihan1(ActionEvent event){
         try {
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/PilihTeknisi.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    //stage.setResizable(false);
                    stage.show();
        } catch (IOException e) {

        }
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}
