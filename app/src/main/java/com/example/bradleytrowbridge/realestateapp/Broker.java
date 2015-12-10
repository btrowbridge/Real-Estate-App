package com.example.bradleytrowbridge.realestateapp;

import java.util.ArrayList;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class Broker extends Person {
    public ArrayList<Seller> clients;

    public Broker(){
        setType("Broker");
    }
}
