/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.teknisikita.dao.PemesananDao;
import org.teknisikita.dao.TeknisiDao;
import org.teknisikita.dao.impl.PemesananDaoImplHibernate;
import org.teknisikita.dao.impl.TeknisiDaoImplHibernate;
import org.teknisikita.model.Pemesanan;
import org.teknisikita.model.Teknisi;

/**
 *
 * @author K A L I T
 */
public class PilihTeknisiController implements Initializable {

    @FXML
    private TableView<Teknisi> teknisiTB;
    @FXML
    private TableColumn<Teknisi, String> idT;
    @FXML
    private TableColumn<Teknisi, String> namaT;
    @FXML
    private TableColumn<Teknisi, String> jeniskelaminT;
    @FXML
    private TableColumn<Teknisi, String> teleponT;
    @FXML
    private TableColumn<Teknisi, String> idLokasiT;
    @FXML
    private TextField search;

    ObservableList<Teknisi> dataTeknisi;
    private TeknisiDao tDao;
    private PemesananDao pDao;

    public PilihTeknisiController() {

        tDao = new TeknisiDaoImplHibernate();
        teknisiTB = new TableView<>();
        pDao = new PemesananDaoImplHibernate();
    }

    public void loadData() {
        List<Teknisi> teknisis = tDao.getAllTeknisi();
        dataTeknisi = FXCollections.observableArrayList(teknisis);
        idT.setCellValueFactory(new PropertyValueFactory<Teknisi, String>("id"));
        namaT.setCellValueFactory(new PropertyValueFactory<Teknisi, String>("nama"));
        jeniskelaminT.setCellValueFactory(new PropertyValueFactory<Teknisi, String>("jeniskelamin"));
        teleponT.setCellValueFactory(new PropertyValueFactory<Teknisi, String>("telepon"));
        idLokasiT.setCellValueFactory(new PropertyValueFactory<Teknisi, String>("idLokasi"));
        teknisiTB.setItems(dataTeknisi);
    }

    public void pesan(ActionEvent event) {

        List<Teknisi> teknisis = tDao.getAllTeknisi();
        dataTeknisi = FXCollections.observableArrayList(teknisis);

        for (Teknisi teknisi : teknisis) {
            if (search.getText().equals(teknisi.getId())) {
                String id = LoginController.id;
                String nama = LoginController.nama;
                String alamat = LoginController.alamat;
                Date d = new Date();
                Pemesanan p = new Pemesanan(id, nama, alamat, teknisi.getId(), d.toString());
                pDao.saveDataPemesanan(p);
                System.out.println("tersimpan");
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
            }
        }
    }

    
    public void search(){
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

}
