package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
//    @Autowired
//            @Qualifier("square")
//            @Qualifier("triangle")
//            @Qualifier("rectangle")
//    IShape shape;
    @Autowired
    @Qualifier("triangle")
    IShape shape1;
    @Autowired
    @Qualifier("square")
    IShape shape2;

//    @Autowired
//    IShape recShape; //autowiring by name
    // one of the bean nama and the instance variable name are same

    @Autowired
    IShape recShape;
    public ShapeFactory(IShape recShape) {
        this.recShape = recShape;
    }

    void printArea(String choice , int x, int y){
        System.out.println("Printing area");
//        shape.calcArea(x,y);
        if (choice.equalsIgnoreCase("t"))
        shape1.calcArea(x,y);
        if (choice.equalsIgnoreCase("s"))
        shape2.calcArea(x,y);
        if (choice.equalsIgnoreCase("r"))
        recShape.calcArea(x,y);

    }

}
