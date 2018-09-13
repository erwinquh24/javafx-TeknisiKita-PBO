/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import org.teknisikita.dao.TeknisiDao;
import org.teknisikita.dao.UserDao;
import org.teknisikita.dao.impl.TeknisiDaoImplHibernate;
import org.teknisikita.dao.impl.UserDaoImplHibernate;
import org.teknisikita.model.Teknisi;

/**
 *
 * @author Yusuf Pangaribuan
 */
public class PesanController implements Initializable {

    private TeknisiDao tDao;
    @FXML
    private ComboBox pilihLokasiCB;

    @FXML
    private TableView<Teknisi> tabelTeknisiTV;
    @FXML
    private TableColumn<Teknisi, String> idTeknisiTC;
    @FXML
    private TableColumn<Teknisi, String> idLokasiTC;
    @FXML
    private TableColumn<Teknisi, String> namaTC;
    @FXML
    private TableColumn<Teknisi, String> jenisKelaminTC;
    @FXML
    private TableColumn<Teknisi, String> teleponTC;
    @FXML
    private TextField idPesananTF;

    ObservableList<Teknisi> data;
    ObservableList<String> items = FXCollections.observableArrayList("tek123", "Jawa", "Kalimantan", "Sulawesi", "Papua");

    public PesanController() {
        tDao = new TeknisiDaoImplHibernate();
        tabelTeknisiTV = new TableView<>();
    }

    private void loadData() {
        List<Teknisi> teknisis = tDao.getAllTeknisi();
        for (Teknisi t : teknisis) {
            System.out.println("nama :" + t.getNama());
            data = FXCollections.observableArrayList(teknisis);
            idTeknisiTC.setCellValueFactory(
                    new PropertyValueFactory<Teknisi, String>("id"));
            idLokasiTC.setCellValueFactory(
                    new PropertyValueFactory<Teknisi, String>("idLokasi"));
            namaTC.setCellValueFactory(
                    new PropertyValueFactory<Teknisi, String>("nama"));
            jenisKelaminTC.setCellValueFactory(
                    new PropertyValueFactory<Teknisi, String>("jeniskelamin"));
            teleponTC.setCellValueFactory(
                    new PropertyValueFactory<Teknisi, String>("telepon"));
            tabelTeknisiTV.setItems(data);
        }
    }

    @FXML
    private void btnPilihLokasiCB() throws IOException {
        loadData();
    }

    @FXML
    private void btnPesan() throws IOException {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pilihLokasiCB.setItems(items);
    }

}
