package org.example.lesson2;

import org.example.lesson2.PetrolEngine;

public class Vehicle {

    // What if you want to use Diesel Engine, then you have to change this class
    PetrolEngine pE;

    public Vehicle() {
        this.pE = new PetrolEngine();
    }

    public void start() {
        System.out.println("Vehicle started with " + pE.getEngineType());
    }
}
