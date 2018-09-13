/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.teknisikita.dao.UserDao;
import org.teknisikita.model.User;
import org.teknisikita.util.HibernateUtil;

/**
 *
 * @author K A L I T
 */
public class UserDaoImplHibernate  implements UserDao{

    @Override
    public void saveDataUser(User b) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(b);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }

    @Override
    public User getDataUSer(int id) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        User m = (User) session.get(User.class,id);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return m;
    }

    @Override
    public List<User> getAllUser() {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<User> users = session.createCriteria(User.class).list();
        session.getTransaction().commit();
        return users;
    }
    
}
