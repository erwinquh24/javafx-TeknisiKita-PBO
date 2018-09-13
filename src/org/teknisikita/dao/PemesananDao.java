/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao;

import java.util.List;
import org.teknisikita.model.Pemesanan;


/**
 *
 * @author K A L I T
 */
public interface PemesananDao {
     public void saveDataPemesanan(Pemesanan p);
    public Pemesanan getDataPemesanan(int id);
    public List<Pemesanan> getAllPemesanan();
}
