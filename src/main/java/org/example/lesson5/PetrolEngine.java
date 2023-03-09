package org.example.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {
    final String type = "Petrol Engine";

    public String getEngineType() {
        return this.type;
    }
}
