/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.implementation;

import com.travelbackend.DAO.contract.TravelDAO;
import com.travelbackend.constants.FlightStatus;
import com.travelbackend.entities.Airplane;
import com.travelbackend.entities.Flight;
import com.travelbackend.entities.Seat;
import com.travelbackend.util.MongoConnectionManager;
import com.travelbackend.util.utilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author cristianhoyos66
 */
public class TravelDAOImpl extends BasicDAO<Flight, ObjectId> implements TravelDAO {
    
    private Datastore ds;
    private Class<Flight> entityClass;
    private String[] origins = {
        "Medellín",
        "Bogotá",
        "Pereira"
    };
    private String[] destinies = {
        "Manizales",
        "Anserma",
        "Barranquilla"
    };

    public TravelDAOImpl(Class<Flight> entityClass, Datastore ds) {
        super(entityClass, ds);
        this.ds = ds;
        this.entityClass = entityClass;
    }

    @Override
    public List<Flight> getAll() {
        return ds.find(entityClass).asList();
    }

    @Override
    public HashMap<String, Boolean> create() {
        HashMap<String, Boolean> hm = new HashMap<>();
        this.save(generateFlightObj());
        hm.put("created", true);
        return hm;
    }
    
    private Flight generateFlightObj() {
        AirplaneDAOImpl airplaneDAOImpl = new AirplaneDAOImpl(Airplane.class, MongoConnectionManager.getInstance().getDatastore());
        String origin = origins[utilities.randomNumber(0, 2)];
        String destiny = destinies[utilities.randomNumber(0, 2)];
        FlightStatus status = FlightStatus.SIN_DESPEGAR;
        double rate = utilities.randomNumber(1000000, 10000000);
        Date schedule = utilities.generateAleatoryDate();
        Airplane airplane = airplaneDAOImpl.getOneRand();
        Flight flight = new Flight(status, schedule, rate, origin, destiny, airplane);
        return flight;
    }
    
}
