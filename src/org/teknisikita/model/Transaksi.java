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
 * @author Yusuf Pangaribuan
 */
@Entity
@Table(name = "transaksi")
public class Transaksi {

    @Id
    String idTeknisi;
    @Column(name = "idLokasi")
    String idLokasi;
    @Column(name = "id_User")
    String id_User;
    @Column(name = "harga")
    String harga;
    @Column(name = "status")
    String status;

    public Transaksi() {
    }

    public Transaksi(String idTeknisi, String idLokasi, String id_User, String harga, String status) {
        this.idTeknisi = idTeknisi;
        this.idLokasi = idLokasi;
        this.id_User = id_User;
        this.harga = harga;
        this.status = status;
    }

    public String getIdTeknisi() {
        return idTeknisi;
    }

    public void setIdTeknisi(String idTeknisi) {
        this.idTeknisi = idTeknisi;
    }

    public String getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }

    public String getId_User() {
        return id_User;
    }

    public void setId_User(String id_User) {
        this.id_User = id_User;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
