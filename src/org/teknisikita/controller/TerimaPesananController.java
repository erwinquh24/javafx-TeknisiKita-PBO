/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.teknisikita.dao.PemesananDao;
import org.teknisikita.dao.impl.PemesananDaoImplHibernate;
import org.teknisikita.model.Pemesanan;
import org.teknisikita.model.Teknisi;

/**
 *
 * @author K A L I T
 */
public class TerimaPesananController implements Initializable{

   
    @FXML
    private TableView<Pemesanan> PesanTB;
    @FXML
    private TableColumn<Pemesanan, String> idP;
    @FXML
    private TableColumn<Pemesanan, String> namaP;
    @FXML
    private TableColumn<Pemesanan, String> alamatP;
    @FXML
    private TableColumn<Pemesanan, String> tglP;

    private PemesananDao pDao;
    ObservableList<Pemesanan> dataPemesanan;

    public TerimaPesananController() {
        pDao = new PemesananDaoImplHibernate();

    }

    public void loadData() {
         List<Pemesanan> pesans = pDao.getAllPemesanan();
        dataPemesanan = FXCollections.observableArrayList(pesans);
        idP.setCellValueFactory(new PropertyValueFactory<Pemesanan, String>("id"));
        namaP.setCellValueFactory(new PropertyValueFactory<Pemesanan, String>("nama"));
        alamatP.setCellValueFactory(new PropertyValueFactory<Pemesanan, String>("alamat"));
        tglP.setCellValueFactory(new PropertyValueFactory<Pemesanan, String>("tgltransaksi"));
        PesanTB.setItems(dataPemesanan);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

}
