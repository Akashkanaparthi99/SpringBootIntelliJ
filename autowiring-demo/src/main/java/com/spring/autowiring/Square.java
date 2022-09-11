package com.spring.autowiring;

import org.springframework.stereotype.Component;

import java.awt.*;
@Component
public class Square implements IShape {
    @Override
    public void calcArea(int x, int y) {
        System.out.println(x*x);
    }
}
