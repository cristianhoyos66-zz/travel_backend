/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.entities;

import java.io.Serializable;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author cristianhoyos66
 */
@Entity("airplanes")
public class Airplane implements Serializable {
    
    @Id
    private ObjectId _id;
    private String reference;
    @Reference
    private List<Seat> seats;

    public Airplane() {
    }
    
        public Airplane(String reference, List<Seat> seats) {
        this.reference = reference;
        this.seats = seats;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Airplane{" + "_id=" + _id + ", reference=" + reference + ", seats=" + seats + '}';
    }
    
}
