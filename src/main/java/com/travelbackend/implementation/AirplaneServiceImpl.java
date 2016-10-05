/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.implementation;

import com.travelbackend.DAO.implementation.AirplaneDAOImpl;
import com.travelbackend.contract.AirplaneServices;
import com.travelbackend.entities.Airplane;
import com.travelbackend.util.MongoConnectionManager;
import java.util.HashMap;

/**
 *
 * @author cristianhoyos66
 */
public class AirplaneServiceImpl implements AirplaneServices {

    @Override
    public HashMap<String, Boolean> create() {
        AirplaneDAOImpl daoImpl = new AirplaneDAOImpl(Airplane.class, MongoConnectionManager.getInstance().getDatastore());
        return daoImpl.create();
    }
    
}
