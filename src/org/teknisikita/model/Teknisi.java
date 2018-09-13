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
@Table(name="teknisi")
public class Teknisi {

    @Id
    String id;
    @Column(name = "nama")
    String nama;
    @Column(name = "jeniskelamin")
    String jeniskelamin;
    @Column(name = "telepon")
    String telepon;
    @Column(name = "idLokasi")
    String idLokasi;
    @Column(name = "password")
    String password;

    public Teknisi() {
    }

    
    
    public Teknisi(String id, String nama, String jeniskelamin, String telepon, String idLokasi, String password) {
        this.id = id;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.telepon = telepon;
        this.idLokasi = idLokasi;
        this.password = password;
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

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
