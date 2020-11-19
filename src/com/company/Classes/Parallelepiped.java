package com.company.Classes;

public class Parallelepiped extends Rectangle {

    private final int SIMILAR_FLATS = 2;
    private double a_side;

    @Override
    public double getA_side() {
        return a_side;
    }

    @Override
    public void setA_side(double a_side) {
        this.a_side = a_side;
    }

    @Override
    public double getB_side() {
        return b_side;
    }

    @Override
    public void setB_side(double b_side) {
        this.b_side = b_side;
    }

    public double getC_side() {
        return c_side;
    }

    public void setC_side(double c_side) {
        this.c_side = c_side;
    }

    private double b_side;
    private double c_side;
    public Parallelepiped(double a_side, double b_side, double c_side) {
        super(a_side, b_side);
        this.a_side = a_side;
        this.b_side = b_side;
        this.c_side = c_side;
    }

    //  объём
    public double Volume(){ return a_side * b_side * c_side;}

    //  перегрузки
    @Override
    public double Area() { return (a_side * b_side + b_side * c_side + c_side * a_side) * SIMILAR_FLATS; }/*return super.Area();*/


//    public void Outputting(){
//        System.out.println("\n<>Parallelepiped<>\nVolume is " + Volume() + "\nArea is " + Area());
//    }


    @Override
    public String toString() {
        return "\n<>Parallelepiped<>\nVolume is " + Volume() + "\nArea is " + Area();
    }
}
