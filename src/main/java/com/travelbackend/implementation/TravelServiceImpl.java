package com.travelbackend.implementation;

import com.travelbackend.DAO.implementation.TravelDAOImpl;
import com.travelbackend.contract.TravelServices;
import com.travelbackend.entities.Flight;
import com.travelbackend.util.MongoConnectionManager;
import java.util.HashMap;
import java.util.List;

public class TravelServiceImpl implements TravelServices {

    @Override
    public List<Flight> getAll() {
        TravelDAOImpl daoImpl = new TravelDAOImpl(Flight.class, MongoConnectionManager.getInstance().getDatastore());
        return daoImpl.getAll();
    }  

    @Override
    public HashMap<String, Boolean> create() {
        TravelDAOImpl daoImpl = new TravelDAOImpl(Flight.class, MongoConnectionManager.getInstance().getDatastore());
        return daoImpl.create();
    }
}
