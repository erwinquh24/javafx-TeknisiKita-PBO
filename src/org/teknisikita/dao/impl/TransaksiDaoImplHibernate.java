/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.teknisikita.dao.TransaksiDao;
import org.teknisikita.model.Teknisi;
import org.teknisikita.model.Transaksi;
import org.teknisikita.util.HibernateUtil;

/**
 *
 * @author Yusuf Pangaribuan
 */
public class TransaksiDaoImplHibernate implements TransaksiDao {

    @Override
    public void saveDataTransaksi(Transaksi t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//
//    @Override
//    public Transaksi getDataTransaksi(int id) {
//        Session session = HibernateUtil.getSession();
//        session.getTransaction().begin();
//        Transaksi m = (Transaksi) session.get(Transaksi.class, id);
//        session.getTransaction().commit();
//        HibernateUtil.closeSession();
//        return m;
//    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<Transaksi> transaksis = session.createCriteria(Transaksi.class).list();
        session.getTransaction().commit();
        return transaksis;
    }

    @Override
    public Transaksi getDataTransaksi(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
