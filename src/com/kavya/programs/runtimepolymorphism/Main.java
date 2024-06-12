package com.kavya.programs.runtimepolymorphism;

public class Main
{
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.draw();
        Shape shape1 = new Triangle();
        shape1.draw();
        Shape shape2 = new Polygon();
        shape2.draw();
    }
}
