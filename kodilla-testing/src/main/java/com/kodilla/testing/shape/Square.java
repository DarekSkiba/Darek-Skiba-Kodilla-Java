package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    Double field;

        public void draw() {
            System.out.println("I am drawing a Square!");
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
