/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teknisikita.dao;

import java.util.List;
import org.teknisikita.model.User;

/**
 *
 * @author K A L I T
 */
public interface UserDao {
    public void saveDataUser(User b);
    public User getDataUSer(int id);
    public List<User> getAllUser();
}
