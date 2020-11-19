package com.company.Classes;

public class Rectangle {


    public void setA_side(double a_side) {
        this.a_side = a_side;
    }

    public void setB_side(double b_side) {
        this.b_side = b_side;
    }

    private double a_side;
    private double b_side;

    public double getA_side() {
        return a_side;
    }

    public double getB_side() {
        return b_side;
    }

    private final int SAMEEDGES = 2;

    public Rectangle(double a_side, double b_side) {
        this.a_side = a_side;
        this.b_side = b_side;
    }

    //  диагональ
    public double Diagonal(){ return Math.sqrt(Math.pow(a_side, 2) + Math.pow(b_side, 2)); }

    //  периметр
    public double Perimeter(){ return a_side * 2 + b_side * 2; }

    //  площадь
    public double Area(){ return a_side * b_side; }


    @Override
    public String toString() {
        return "\n<>Rectangle<>\nDiagonal is " + Diagonal() + "\nPerimeter is " + Perimeter() + "\nArea is " + Area();
    }
}
