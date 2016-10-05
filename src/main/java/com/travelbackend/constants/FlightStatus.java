/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.constants;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author cristianhoyos66
 */
public enum FlightStatus implements Serializable {

    EN_VUELO(1),
    SIN_DESPEGAR(2),
    ATERRIZÓ(3);
    
    private final Integer val;
    private static HashMap<Integer, FlightStatus> map = new HashMap<>();
    
    private FlightStatus(Integer val) {
        this.val = val;
    }
  
    static {
        for (FlightStatus obj : FlightStatus.values()) {
            map.put(obj.val, obj);
        }
    }
    
    public Integer getObjTypeValue() {
        return this.val;
    }

    public static FlightStatus getFromValue(int val) {
        return map.get(val);
    }

}
