/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao;

import java.util.List;
import org.teknisikita.model.Teknisi;

/**
 *
 * @author K A L I T
 */
public interface TeknisiDao {
    public void saveDataTeknisi(Teknisi t);
    public Teknisi getDataTeknisi(int id);
    public List<Teknisi> getAllTeknisi();
}
