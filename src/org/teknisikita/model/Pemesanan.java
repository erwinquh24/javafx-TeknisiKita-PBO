/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author K A L I T
 */
@Entity
@Table(name="pemesanan")
public class Pemesanan {
    
    @Id
    String id;
    @Column(name = "nama")
    String nama;
    @Column(name = "alamat")
    String alamat;
    @Column(name = "idteknisi")
    String idteknisi;
    @Column(name = "tgltransaksi")
    String tgltransaksi;

    public Pemesanan() {
    }

    public Pemesanan(String id, String nama, String alamat, String idteknisi, String tgltransaksi) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.idteknisi = idteknisi;
        this.tgltransaksi = tgltransaksi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getIdteknisi() {
        return idteknisi;
    }

    public void setIdteknisi(String idteknisi) {
        this.idteknisi = idteknisi;
    }

    public String getTgltransaksi() {
        return tgltransaksi;
    }

    public void setTgltransaksi(String tgltransaksi) {
        this.tgltransaksi = tgltransaksi;
    }

    
    
    
}
