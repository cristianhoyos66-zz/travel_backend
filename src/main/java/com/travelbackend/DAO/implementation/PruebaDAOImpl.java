/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.implementation;

import com.travelbackend.DAO.contract.pruebaDAO;
import com.travelbackend.entities.User;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author cristianhoyos66
 */
public class PruebaDAOImpl extends BasicDAO<User, ObjectId> implements pruebaDAO {

    public PruebaDAOImpl(Class<User> entityClass, Datastore ds) {
        super(entityClass, ds);
    }
    
    @Override
    public void metodoPrueba() {
        User user = new User("Cristian", "Hoyos", "");
        this.save(user);
    }
    
}
