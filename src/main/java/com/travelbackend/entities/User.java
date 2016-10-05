/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.entities;

import java.io.Serializable;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author cristianhoyos66
 */

@Entity("users")
public class User implements Serializable {
    
    @Id
    private ObjectId _id;
    private String name;
    private String surname1;
    private String surname2;

    public User() {
    }
    
    public User(String name, String surname1, String surname2) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    @Override
    public String toString() {
        return "User{" + "_id=" + _id + ", name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2 + '}';
    }
    
}
