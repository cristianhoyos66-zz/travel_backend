/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.DAO.contract;

import com.travelbackend.entities.Flight;
import com.travelbackend.entities.Seat;
import java.util.HashMap;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

/**
 *
 * @author cristianhoyos66
 */
public interface SeatDAO extends DAO<Seat, ObjectId> {

    public HashMap<String, Boolean> create();
    public List<Seat> getAll();

}
