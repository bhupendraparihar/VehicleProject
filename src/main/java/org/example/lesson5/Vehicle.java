package org.example.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    // What if you want to use Diesel Engine, then you have to change this class
    // Now this line did not need to be modified
    @Autowired
    Engine engine;

    //Inject Engine as dependency in Vehicle
    public Vehicle(Engine e) {
        // But we have to make change here, if we want to use DieselEngine
        this.engine = e; //Now this line also does not need to be modified
    }

    public void start() {
        System.out.println("Vehicle started with " + engine.getEngineType());
    }
}
