/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.entities;

import com.travelbackend.constants.FlightStatus;
import java.io.Serializable;
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author cristianhoyos66
 */

@Entity("fligths")
@Indexes({
    @Index(fields = @Field("withoutSeats")),
    @Index(fields = @Field("schedule")),
    @Index(fields = @Field("rate"))
})
public class Flight implements Serializable {
    @Id
    private ObjectId _id;
    private FlightStatus status;
    private Date schedule;  
    private Double rate;
    private String origin;
    private String destiny;
    @Reference
    private Airplane airplane;

    public Flight() {
    }

    public Flight(FlightStatus status, Date schedule, Double rate, String origin, String destiny, Airplane airplane) {
        this.status = status;
        this.schedule = schedule;
        this.rate = rate;
        this.origin = origin;
        this.destiny = destiny;
        this.airplane = airplane;
    }
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public String toString() {
        return "Flight{" + "_id=" + _id + ", status=" + status + ", schedule=" + schedule + ", rate=" + rate + ", origin=" + origin + ", destiny=" + destiny + ", airplane=" + airplane + '}';
    }
    
}
