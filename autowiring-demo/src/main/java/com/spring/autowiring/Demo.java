package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.autowiring");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);

        shapeFactory.printArea("s",10,25);
        shapeFactory.printArea("r",15,5);
        shapeFactory.printArea("t",7,16);
    }
}
