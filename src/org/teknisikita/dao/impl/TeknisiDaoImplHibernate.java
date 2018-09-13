/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.teknisikita.dao.TeknisiDao;
import org.teknisikita.model.Teknisi;
import org.teknisikita.model.User;
import org.teknisikita.util.HibernateUtil;

/**
 *
 * @author K A L I T
 */
public class TeknisiDaoImplHibernate implements TeknisiDao{

    @Override
    public void saveDataTeknisi(Teknisi t) {
         Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(t);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }

    @Override
    public Teknisi getDataTeknisi(int id) {
         Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Teknisi m = (Teknisi) session.get(Teknisi.class,id);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return m;
    }

    @Override
    public List<Teknisi> getAllTeknisi() {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<Teknisi> teknisis = session.createCriteria(Teknisi.class).list();
        session.getTransaction().commit();
        return teknisis;
    }
    
}
