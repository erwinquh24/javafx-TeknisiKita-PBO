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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.teknisikita.dao.PemesananDao;
import org.teknisikita.dao.impl.PemesananDaoImplHibernate;
import org.teknisikita.model.Pemesanan;
import org.teknisikita.model.Teknisi;

/**
 *
 * @author K A L I T
 */
public class NotifikasiController implements Initializable{

    
    private PemesananDao pDao;
    
    ObservableList<Pemesanan> dataPemesanan;
    
    @FXML
    private Label banyak;

//    public NotifikasiController() {
//        pDao = new PemesananDaoImplHibernate();
//    }
    
    
    
    @FXML
    public void banyak(){
        
        pDao = new PemesananDaoImplHibernate();
        List<Pemesanan> pesans = pDao.getAllPemesanan();
        
        
        String id = LoginController.id;
        
        for (Pemesanan p : pesans) {
            if (id.equals(p.getIdteknisi())) {
              
                System.out.println("dipanggil : "+ p.getNama());
                
                int o = p.getNama().length();
                
                banyak.setText(""+o);
                
            }
        }
        
        
        
    }
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        banyak();
        //banyak.setText("test");
    }
    
}
