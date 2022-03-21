package com.company;

public class Triangle extends Shape{
    private double base = 1.0;
    private double height = 1.0;

    public Triangle(){
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, boolean filled, double base, double height) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setWidth(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + base +
                ", length=" + height +
                '}';
    }
}