/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.implementation;

import com.travelbackend.DAO.implementation.SeatDAOImpl;
import com.travelbackend.contract.SeatServices;
import com.travelbackend.entities.Seat;
import com.travelbackend.util.MongoConnectionManager;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cristianhoyos66
 */
public class SeatServiceImpl implements SeatServices {

    @Override
    public HashMap<String, Boolean> create() {
        SeatDAOImpl daoImpl = new SeatDAOImpl(Seat.class, MongoConnectionManager.getInstance().getDatastore());
        return daoImpl.create();
    }

    @Override
    public List<Seat> getAll() {
        SeatDAOImpl daoImpl = new SeatDAOImpl(Seat.class, MongoConnectionManager.getInstance().getDatastore());
        return daoImpl.getAll();
    }
    
}
