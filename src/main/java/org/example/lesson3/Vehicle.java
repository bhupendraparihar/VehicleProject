package org.example.lesson3;

public class Vehicle {

    // What if you want to use Diesel Engine, then you have to change this class
    // Now this line need not to be modified
    Engine engine;

    public Vehicle() {
        // But we have to make change here, if we want to use DieselEngine
        this.engine = new PetrolEngine();
    }

    public void start() {
        System.out.println("Vehicle started with " + engine.getEngineType());
    }
}
