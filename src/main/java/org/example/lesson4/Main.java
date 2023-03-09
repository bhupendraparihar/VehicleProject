package org.example.lesson4;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle(new DieselEngine());
        v.start();
    }
}