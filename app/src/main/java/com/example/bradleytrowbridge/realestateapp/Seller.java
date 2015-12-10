package com.example.bradleytrowbridge.realestateapp;

import java.util.ArrayList;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class Seller extends Person {
    private Broker broker;
    private ArrayList<Properties> properties;

    public Seller(){
        setType("Seller");
    }
}
