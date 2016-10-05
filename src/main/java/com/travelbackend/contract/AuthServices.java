/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.contract;

import java.util.HashMap;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author cristianhoyos66
 */

@Path("/auth")
public interface AuthServices {
    
    @Path("/signin")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    HashMap<String, Object> signin();
 
    @Path("/logout")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<HashMap<String, Object>> logout();    

}
