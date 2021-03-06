package com.spring.learn.lifecycle;

import com.spring.learn.configurable.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    @Test
    public void test() {
        context.close();
    }
}
