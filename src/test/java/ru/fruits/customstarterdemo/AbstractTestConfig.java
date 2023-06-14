package ru.fruits.customstarterdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ru.fruits.customstarterdemo.config.StarterConfig;

@SpringBootTest(classes = StarterConfig.class)
@EnableAutoConfiguration
public abstract class AbstractTestConfig {
}
