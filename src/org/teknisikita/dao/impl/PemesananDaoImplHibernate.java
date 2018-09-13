/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.teknisikita.dao.PemesananDao;
import org.teknisikita.model.Pemesanan;
import org.teknisikita.model.Teknisi;
import org.teknisikita.util.HibernateUtil;

/**
 *
 * @author K A L I T
 */
public class PemesananDaoImplHibernate implements PemesananDao{

    @Override
    public void saveDataPemesanan(Pemesanan p) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(p);
        session.getTransaction().commit();
        HibernateUtil.closeSession();

    }

    @Override
    public Pemesanan getDataPemesanan(int id) {
  Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Pemesanan m = (Pemesanan) session.get(Pemesanan.class,id);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return m;
    }

    @Override
    public List<Pemesanan> getAllPemesanan() {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<Pemesanan> pesans = session.createCriteria(Pemesanan.class).list();
        session.getTransaction().commit();
        return pesans;
    }
    
}
