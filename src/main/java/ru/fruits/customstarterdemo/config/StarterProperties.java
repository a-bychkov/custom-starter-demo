package ru.fruits.customstarterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ru.fruits")
@Data
public class StarterProperties {
    private String name = "Default";
}
