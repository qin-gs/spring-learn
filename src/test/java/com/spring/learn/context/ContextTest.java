package com.spring.learn.context;

import com.spring.learn.config.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@DisplayName("ApplicationContext 功能测试")
public class ContextTest {

    @Test
    public void test() {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    }
}
