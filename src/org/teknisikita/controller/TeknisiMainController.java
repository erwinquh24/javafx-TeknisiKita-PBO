/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author K A L I T
 */
public class TeknisiMainController implements Initializable {

    @FXML
    private Label idstatus;
    @FXML
    private Label fullnamestatus;
    @FXML
    private Label namastatus;

    @FXML
    private StackPane acContent;
    
    @FXML
    private Label logteknisi;
    
    
    @FXML
    public void logout(ActionEvent event) {
        try {

            ((Node) (event.getSource())).getScene().getWindow().hide();
            System.out.println("logout");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/Login.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1, 279, 295));
            stage.setResizable(false);

            stage.show();

        } catch (IOException e) {
        }

    }
    
    @FXML
    public void pesan(ActionEvent event){
         try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/TerimaPesanan.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }
    
    @FXML
    public void notif(){
         try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/Notifikasi.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String id = LoginController.id;
        String nama = LoginController.nama;
        idstatus.setText("ID : " + id);
        fullnamestatus.setText("Nama : " + nama);
        namastatus.setText("Hi, " + nama);
        notif();
        Date d = new Date();
        logteknisi.setText(d.toString());
    }

}
