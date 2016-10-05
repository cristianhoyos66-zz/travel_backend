/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.entities;

import java.io.Serializable;
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
@Entity("seats")
@Indexes(
    @Index(fields = @Field("busy"))
)
public class Seat implements Serializable {

    @Id
    private ObjectId _id;
    private Integer row;
    private Integer column;
    private Boolean busy;
    @Reference
    private User user;

    public Seat() {
    }
    
    public Seat(Integer row, Integer column, Boolean busy) {
        this.row = row;
        this.column = column;
        this.busy = busy;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Seat{" + "_id=" + _id + ", row=" + row + ", column=" + column + ", busy=" + busy + '}';
    }

}
