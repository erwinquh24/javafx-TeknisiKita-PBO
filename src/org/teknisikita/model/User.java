/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author K A L I T
 */

@Entity
@Table(name="user")
public class User {

    @Id
    String id;
    @Column(name = "nama")
    String nama;
    @Column(name = "pekerjaan")
    String pekerjaan;
    @Column(name = "alamat")
    String alamat;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;

    public User() {
    }

    public User(String id, String nama, String pekerjaan, String alamat, String email, String password) {
        this.id = id;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.email = email;
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

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
 
    
}
