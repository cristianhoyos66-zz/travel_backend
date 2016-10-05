/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.contract;

import com.travelbackend.entities.Flight;
import java.util.HashMap;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

/**
 *
 * @author cristianhoyos66
 */
public interface TravelDAO extends DAO<Flight, ObjectId> {
    public List<Flight> getAll();
    public HashMap<String, Boolean> create();
}
