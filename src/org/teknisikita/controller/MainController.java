/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import static java.awt.SystemColor.window;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import org.teknisikita.dao.UserDao;


/**
 *
 * @author K A L I T
 */
public class MainController implements Initializable {

    @FXML
    private Label idstatus;
    @FXML
    private Label fullnamestatus;
    @FXML
    private Label namastatus;
    @FXML
    private Label time;
    @FXML
    private StackPane acContent;



    @FXML
    private Stage st;

    @FXML
    private void utama() {
        try {
            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/MenuPilihan.fxml").openStream());
            AnchorPane acPane1 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane1);
        } catch (IOException e) {

        }
    }

    @FXML
    private void btnBeranda(ActionEvent event) throws IOException {
        try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/MenuPilihan.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }

    
    @FXML
    private void btnProfil(ActionEvent event) throws IOException {
        try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/Profil.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }
    
    
    
    @FXML
    private void btnAbout(ActionEvent event) throws IOException {
        try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/About.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }
    
    @FXML
    private void btnPesan(ActionEvent event) throws IOException {
        try {

            System.out.println("ditampilkan");
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/org/teknisikita/view/PilihTeknisi.fxml").openStream());
            AnchorPane acPane2 = fXMLLoader.getRoot();
            acContent.getChildren().clear();
            acContent.getChildren().add(acPane2);

        } catch (IOException e) {

        }
    }
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
 
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String id = LoginController.id;
        String nama = LoginController.nama;
        idstatus.setText("ID : " + id);
        fullnamestatus.setText("Nama : " + nama);
        namastatus.setText("Hi, " + nama);
        Date d = new Date();
        time.setText("log "+d);
       utama();

    }

}
