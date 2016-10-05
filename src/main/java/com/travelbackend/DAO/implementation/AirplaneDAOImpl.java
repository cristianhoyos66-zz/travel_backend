/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.implementation;

import com.travelbackend.DAO.contract.AirplaneDAO;
import com.travelbackend.entities.Airplane;
import com.travelbackend.entities.Seat;
import com.travelbackend.util.MongoConnectionManager;
import com.travelbackend.util.utilities;
import java.util.HashMap;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author cristianhoyos66
 */
public class AirplaneDAOImpl extends BasicDAO<Airplane, ObjectId> implements AirplaneDAO {
    
    private Datastore ds;

    public AirplaneDAOImpl(Class<Airplane> entityClass, Datastore ds) {
        super(entityClass, ds);
        this.ds = ds;
    }

    @Override
    public HashMap<String, Boolean> create() {
        HashMap<String, Boolean> hm = new HashMap<>();
        generateAirplaneObj();
        hm.put("created", true);
        return hm;
    }
    

    @Override
    public Airplane getOneRand() {
        List<Airplane> airplanes = getAll();
        return airplanes.get(utilities.randomNumber(0, airplanes.size()-1));
    }
    
    @Override
    public List<Airplane> getAll() {
        return this.find().asList();
    }

    private Airplane generateAirplaneObj() {
        SeatDAOImpl seatDAOImpl = new SeatDAOImpl(Seat.class, MongoConnectionManager.getInstance().getDatastore());
        String reference = randomReference();
        List seats = seatDAOImpl.getAll();
        Airplane airplane = new Airplane(reference, seats);
        this.save(airplane);
        return airplane;
    }
    
    private String randomReference() {
        String reference = "";
        for (int i = 0; i < 2; i++) {
            reference += utilities.randomChar();
        }
        for (int i = 0; i < 2; i++) {
            reference += utilities.randomNumber(0, 9);
        }
        return reference;
    }
    
}
