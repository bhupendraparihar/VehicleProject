package org.example.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(Main.class, args);

        // Spring inject the dependency of Vehicle class - this is what we call as "Inversion of Control"
        Vehicle v = appContext.getBean(Vehicle.class);

        v.start();
    }
}