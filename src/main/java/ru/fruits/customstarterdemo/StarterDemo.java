package ru.fruits.customstarterdemo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.fruits.customstarterdemo.config.StarterProperties;

@Component
@Data
@RequiredArgsConstructor
public class StarterDemo {
    private final StarterProperties properties;

    public String sayHello(){
        return "Hello " + properties.getName();
    }
}
