package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("recShape")
public class Rectangle implements IShape{
    @Override
    public void calcArea(int x, int y) {
        System.out.println(x*y);
    }
}
