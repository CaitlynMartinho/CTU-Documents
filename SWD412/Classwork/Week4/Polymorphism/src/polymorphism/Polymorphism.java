/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author caitl
 */
//abstract calss cannot be used to create 
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


public class Polymorphism {
    public static void main(String[] args) {        
        Shape[] shapes = new Shape[2];

        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Circle(7);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
        
    }
    
}
