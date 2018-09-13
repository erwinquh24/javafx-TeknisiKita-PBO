/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao;

import java.util.List;
import org.teknisikita.model.Teknisi;
import org.teknisikita.model.Transaksi;

/**
 *
 * @author Yusuf Pangaribuan
 */
public interface TransaksiDao {
    public void saveDataTransaksi(Transaksi t);
    public Transaksi getDataTransaksi(String id);
    public List<Transaksi> getAllTransaksi();
}
