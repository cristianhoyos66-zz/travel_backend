package com.travelbackend.contract;

import com.travelbackend.entities.Flight;
import java.util.HashMap;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/travel")
public interface TravelServices {

    @Path("/getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Flight> getAll();
    
    @Path("/create")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    HashMap<String, Boolean> create();

}
