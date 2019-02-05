package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    Double field;

        public void draw() {
            System.out.println("I am drawing a Triangle!");
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
