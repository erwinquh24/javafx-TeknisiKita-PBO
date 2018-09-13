/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import org.teknisikita.dao.TeknisiDao;
import org.teknisikita.dao.UserDao;
import org.teknisikita.dao.impl.TeknisiDaoImplHibernate;
import org.teknisikita.dao.impl.UserDaoImplHibernate;
import org.teknisikita.model.Teknisi;

import org.teknisikita.model.User;

/**
 *
 * @author K A L I T
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idTF;
    @FXML
    private Label time;
    @FXML
    private TextField passwordTF;
    private UserDao uDao;
    private TeknisiDao tDao;
    
    static String id,nama,pekerjaan,email,passwordd,alamat;       
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

  
    @FXML
    public void login(ActionEvent event )throws IOException{
        String idd = idTF.getText();
        String password = passwordTF.getText();
        
        if(user(idd, password)==true){
             try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/Main.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    //stage.setResizable(false);
                    stage.show();
                    ((Node) (event.getSource())).getScene().getWindow().hide();

                    //stage.setMaximized(true);
                } catch (IOException e) {

                }
        }else if(teknisi(idd, password)==true){
             try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/TeknisiMain.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    //stage.setResizable(false);
                    stage.show();
                    ((Node) (event.getSource())).getScene().getWindow().hide();

                    //stage.setMaximized(true);
                } catch (IOException e) {

                }
        }else if(idd.equals("admin") && password.equals("admin")){
            try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/TeknisiRegistrasiAdmin.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    //stage.setResizable(false);
                    stage.show();
                    ((Node) (event.getSource())).getScene().getWindow().hide();

                    //stage.setMaximized(true);
                } catch (IOException e) {

                }
            
        }else{
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "ID atau Password anda salah ! ");
        }
        
    }
    

    public boolean user(String id, String password) {
        uDao = new UserDaoImplHibernate();
        List<User> users = uDao.getAllUser();
        boolean ada = false;
        for (User u : users) {
            if (id.equals(u.getId()) && password.equals(u.getPassword())) {
                ada = true;
                System.out.println("dipanggil login id : " + u.getId() + " nama : " + u.getNama() + " pekerjaan : " + u.getPekerjaan());
                    this.id = u.getId();
                    nama = u.getNama();
                    alamat = u.getAlamat();
                    pekerjaan = u.getPekerjaan();
                    alamat = u.getAlamat();
                    email = u.getEmail();
                    passwordd = u.getPassword();
                            
            }

        }
        return ada;
    }
    
    public boolean teknisi(String id, String password){
        tDao = new TeknisiDaoImplHibernate();
        List<Teknisi> teknisis = tDao.getAllTeknisi();
        boolean ada = false;
        for (Teknisi t : teknisis) {
            if (id.equals(t.getId()) && password.equals(t.getPassword())) {
                ada = true;
                System.out.println("dipanggil login id : " + t.getId() + " nama : " + t.getNama() + " jeniskelamin : " + t.getJeniskelamin());
                    
                    this.id = t.getId();
                    nama = t.getNama();
                    alamat = t.getIdLokasi();
            }

        }
        return ada;
        
    }
    

    @FXML
    public void registercall(ActionEvent event) {
        try {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            System.out.println("register");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/teknisikita/view/Register.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1, 365, 390));
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
