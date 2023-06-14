package ru.fruits.customstarterdemo;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest extends AbstractTestConfig {
    @Autowired
    StarterDemo underTest;

    @Test
    @SneakyThrows
    void when_sayHello_then_pass() {
        // given
        String expected = "Hello Ivan Vasilievich";

        // when

        // then
        String actual = underTest.sayHello();
        Assertions.assertEquals(expected, actual);
    }
}
