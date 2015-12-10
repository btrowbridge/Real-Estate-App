package com.example.bradleytrowbridge.realestateapp;

import java.util.ArrayList;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class Agent extends Person {
    private ArrayList<Buyer> clients;

    public Agent(){
        setType("Agent");
    }
}
