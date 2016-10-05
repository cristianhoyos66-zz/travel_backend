/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelbackend.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author cristianhoyos66
 */
public class utilities {
    
    private static String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private utilities() {
    }

    public static int randomNumber(Integer min, Integer max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Date generateAleatoryDate() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = dateRandBetween(2016, 2050);
        gc.set(gc.YEAR, year);
        int dayOfYear = dateRandBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        Date date = gc.getTime();
        return date;
    }
    
    private static int dateRandBetween(int max, int min) {
        return min + (int) Math.round(Math.random() * (max - min));
    }
    
    
    public static char randomChar() {
        Random rd = new Random();
        return abc.charAt(rd.nextInt(abc.length()));
    }

}
