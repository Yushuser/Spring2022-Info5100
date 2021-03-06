package edu.northeastern.yushu;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }@Override
    public double getPerimeter() {
        return radius * Math.PI * 2;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public void computePerimeter() {
        System.out.println("=========================================");
        System.out.println("Perimeter: " + getPerimeter());
    }
    public void computeArea() {
        System.out.println("=========================================");
        System.out.println("Area: " + getArea());
    }
}
