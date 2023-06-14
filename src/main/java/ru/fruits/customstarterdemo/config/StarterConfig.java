package ru.fruits.customstarterdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.fruits.customstarterdemo.StarterDemo;

@Configuration
@ConditionalOnMissingBean(StarterDemo.class)
@EnableConfigurationProperties(StarterProperties.class)
@ComponentScan(basePackages = "ru.fruits.customstarterdemo.*")
public class StarterConfig {
    @Bean
    public StarterDemo starterDemo(StarterProperties properties) {
        return new StarterDemo(properties);
    }
}
