/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import org.teknisikita.dao.UserDao;
import org.teknisikita.dao.impl.UserDaoImplHibernate;
import org.teknisikita.model.User;

/**
 *
 * @author K A L I T
 */
public class ProfilController implements Initializable {

    @FXML
    private Label idLB;
    @FXML
    private Label namaLB;
    @FXML
    private Label pekerjaanLB;
    @FXML
    private Label alamatLB;
    @FXML
    private Label emailLB;
    @FXML
    private Label passwordLB;

    public void loadData() {
        String id = LoginController.id;
        String nama = LoginController.nama;
        String pekerjaan = LoginController.pekerjaan;
        String alamat  = LoginController.alamat;
        String email = LoginController.email;
        String password = LoginController.passwordd;
        idLB.setText(id);
        namaLB.setText(nama);
        pekerjaanLB.setText(pekerjaan);
        alamatLB.setText(alamat);
        emailLB.setText(email);
        passwordLB.setText(password);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

}