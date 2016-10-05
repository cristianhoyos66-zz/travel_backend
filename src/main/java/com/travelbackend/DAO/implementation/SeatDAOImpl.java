/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.implementation;

import com.travelbackend.DAO.contract.SeatDAO;
import com.travelbackend.entities.Seat;
import java.util.HashMap;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author cristianhoyos66
 */
public class SeatDAOImpl extends BasicDAO<Seat, ObjectId> implements SeatDAO {
    
    private Datastore ds;
    private Class<Seat> entityClass;

    public SeatDAOImpl(Class<Seat> entityClass, Datastore ds) {
        super(entityClass, ds);
        this.ds = ds;
        this.entityClass = entityClass;
    }

    @Override
    public HashMap<String, Boolean> create() {
        HashMap<String, Boolean> hm = new HashMap<>();
        generateSeats();
        hm.put("created", true);
        return hm;
    }

    @Override
    public List<Seat> getAll() {
        return ds.find(entityClass).asList();
    }
    
    private void generateSeats() {
        for (Integer i = 1; i <= 50; i++) {
            for (Integer j = 1; j <= 4; j++) {
                Seat seat = new Seat(i, j, false);
                this.save(seat);
            }
        }
    }
    
}
