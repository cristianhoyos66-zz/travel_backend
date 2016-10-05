/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.implementation;

import com.travelbackend.contract.AuthServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cristianhoyos66
 */
public class AuthServiceImpl implements AuthServices {

    @Override
    public HashMap<String, Object> signin() {
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("session", true);
        return hm;
    }

    @Override
    public List<HashMap<String, Object>> logout() {
        List<HashMap<String, Object>> list = new ArrayList<>();
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("session", false);
        list.add(hm);
        return list;
    } 

}
