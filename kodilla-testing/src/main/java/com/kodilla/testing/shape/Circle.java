package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    Double field;


        public void draw() {
            System.out.println("I am drawing a Circle!");
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getfield() {
        return field;
    }
}
