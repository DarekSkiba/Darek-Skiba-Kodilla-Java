package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddShape() {
        ShapeCollector sc = new ShapeCollector();

        sc.addFigure(new Square());
        sc.addFigure(new Triangle());
        sc.addFigure(new Circle());

        Assert.assertEquals(3,sc.ListShape.size());

    }




}

//Napisz testy sprawdzające metody klasy ShapeCollector.