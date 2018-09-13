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
import org.teknisikita.dao.UserDao;
import org.teknisikita.dao.impl.UserDaoImplHibernate;
import org.teknisikita.model.User;

/**
 *
 * @author Yusuf Pangaribuan
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField idreg;
    @FXML
    private TextField namareg;
    @FXML
    private ComboBox pekerjaanCB;
    @FXML
    private TextField alamatreg;
    @FXML
    private TextField emailreg;
    @FXML
    private TextField passwordreg;
    private UserDao uDao;

    ObservableList<String> items = FXCollections.observableArrayList("Mahasiswa", "Dosen", "PNS", "Pengusaha", "dll");

    public RegisterController() {
        uDao = new UserDaoImplHibernate();
    }

    @FXML
    public void register(ActionEvent event) {

        try {
            System.out.println("dipanggil register");
            String id = idreg.getText();
            String nama = namareg.getText();
            String pekerjaan = pekerjaanCB.getValue().toString();
            String alamat = alamatreg.getText();
            String email = emailreg.getText();
            String password = passwordreg.getText();
            User u = new User(id, nama, pekerjaan, alamat, email, password);
            uDao.saveDataUser(u);

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
        pekerjaanCB.setItems(items);
    }

}
