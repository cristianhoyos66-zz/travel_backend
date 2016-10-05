/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.contract;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author cristianhoyos66
 */

@Path("/airplane")
public interface AirplaneServices {

    @Path("/create")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    HashMap<String, Boolean> create();
}
