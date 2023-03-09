package org.example.lesson5;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
    final String type = "Diesel Engine";

    public String getEngineType() {
        return this.type;
    }
}
