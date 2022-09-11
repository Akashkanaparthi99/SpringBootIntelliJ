package com.acheron.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name ;
    private int studentId;
    private Address address;

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    @Value("Raju")
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }
    @Value("23")
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", address=" + address +
                '}';
    }
}
