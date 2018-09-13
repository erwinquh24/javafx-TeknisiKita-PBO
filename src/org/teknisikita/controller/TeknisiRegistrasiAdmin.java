/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.teknisikita.dao.TeknisiDao;
import org.teknisikita.dao.UserDao;
import org.teknisikita.dao.impl.TeknisiDaoImplHibernate;
import org.teknisikita.dao.impl.UserDaoImplHibernate;
import org.teknisikita.model.Teknisi;
import org.teknisikita.model.User;

/**
 *
 * @author Yusuf Pangaribuan
 */
public class TeknisiRegistrasiAdmin implements Initializable {

    @FXML
    private TextField idreg;
    @FXML
    private TextField namareg;
    @FXML
    private ComboBox jeniskelaminCB;
    @FXML
    private TextField teleponreg;
    @FXML
    private TextField idLokasireg;
    @FXML
    private TextField passwordreg;
    private TeknisiDao tDao;

    ObservableList<String> items = FXCollections.observableArrayList("Pria","Wanita");

    public TeknisiRegistrasiAdmin() {
        tDao = new TeknisiDaoImplHibernate();
    }

    @FXML
    public void register(ActionEvent event) {

        try {
            System.out.println("dipanggil register");
            String id = idreg.getText();
            String nama = namareg.getText();
            String pekerjaan = jeniskelaminCB.getValue().toString();
            String alamat = teleponreg.getText();
            String email = idLokasireg.getText();
            String password = passwordreg.getText();
            Teknisi t = new Teknisi(id, nama, pekerjaan, alamat, email, password);
            tDao.saveDataTeknisi(t);

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
        jeniskelaminCB.setItems(items);
    }

}
