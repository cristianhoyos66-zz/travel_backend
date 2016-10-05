/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.util;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author cristianhoyos66
 */
public class MongoConnectionManager {

    private static final MongoConnectionManager INSTANCE = new MongoConnectionManager();
    private final String DB_NAME = "travel_db";
    private final String HOST = "127.0.0.1";
    private final int PORT = 27017;
    
    private Morphia morphia = null;
    private Datastore datastore = null;
    private MongoClient mongoClient = null;

    private MongoConnectionManager() {
        morphia = new Morphia();
        mongoClient = new MongoClient(HOST, PORT);
        datastore = morphia.createDatastore(mongoClient, DB_NAME);
    }

    public static MongoConnectionManager getInstance() {
        return INSTANCE;
    }

    public Datastore getDatastore() {
        return datastore;
    }

}
