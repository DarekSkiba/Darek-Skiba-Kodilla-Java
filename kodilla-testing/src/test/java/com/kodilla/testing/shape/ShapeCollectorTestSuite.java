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

        Assert.assertEquals(3, sc.ListShape.size());

    }

    @Test
    public void testRemoveShape() {
        ShapeCollector ab = new ShapeCollector();
        ab.addFigure(new Circle());
        ab.addFigure(new Square());
        ab.addFigure(new Triangle());
        ab.removeFigure(new Square());

        Assert.assertEquals(2, ab.ListShape.size());
    }

    @Test
    public void testGetShape() {
        ShapeCollector bc = new ShapeCollector();

        bc.addFigure(new Square());
        bc.addFigure(new Triangle());
        bc.addFigure(new Circle());

        Assert.assertEquals(1, bc.ListShape.indexOf(1));
    }

    @Test
    public void testListShape() {
        ShapeCollector cb = new ShapeCollector();

        cb.addFigure(new Square());
        cb.addFigure(new Triangle());
        cb.addFigure(new Circle());


        Assert.assertEquals(3, cb.ListShape.size());
    }
}