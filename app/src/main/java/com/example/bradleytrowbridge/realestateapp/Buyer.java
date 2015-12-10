package com.example.bradleytrowbridge.realestateapp;

import java.util.ArrayList;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class Buyer extends Person {
    private Agent agent;
    private ArrayList<String> preferences;

    public Buyer(){
        setType("Buyer");
    }
}
