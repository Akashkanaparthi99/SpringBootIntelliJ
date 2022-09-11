package com.acheron.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.acheron");
        String []beanName = context.getBeanDefinitionNames();
        Arrays.stream(beanName).forEach(System.out::println);
        // from javabased
        Student student = context.getBean("getStudent",Student.class);
        System.out.println("student = " + student);
        // from annotation
        Student student1 = (Student) context.getBean("student");
        System.out.println("student = " + student1);
        Student student2 = context.getBean(Student.class);
        System.out.println("student = " + student2);
    }
}
