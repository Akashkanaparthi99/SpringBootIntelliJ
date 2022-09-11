package com.acheron.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//IOC container will read the calss annotated with @Configuraion
// it will create an object fro this
@Configuration
public class AppConfig {
    @Bean
    @Primary
    public Student getStudent(){
        Student student = new Student();
        student.setStudentId(1);
        student.setName("priya");
        return student;
    }
    @Bean
//    @Primary
    public Address getAddress(){
        return new Address();
    }
}
