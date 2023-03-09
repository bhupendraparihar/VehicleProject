package org.example.lesson1;

public class Vehicle {
    PetrolEngine pE;

    public Vehicle() {
        this.pE = new PetrolEngine();
    }

    public void start() {
        System.out.println("Vehicle started with " + pE.getEngineType());
    }
}
