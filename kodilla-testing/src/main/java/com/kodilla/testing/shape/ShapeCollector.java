package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    List<Shape> ListShape = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        ListShape.add(shape);
    }


    public void removeFigure(Shape shape) {
        ListShape.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < ListShape.size()) {
            return ListShape.get(n);
        }
        return null;
    }

    public List<Shape> showFigures() {
        return ListShape;
    }
}