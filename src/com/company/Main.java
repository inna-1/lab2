package com.company;

import com.company.Classes.Parallelepiped;
import com.company.Classes.Parallelepipeds;
import com.company.Classes.Rectangle;
import com.company.Classes.Rectangles;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        double a_side;
        double b_side;
        double c_side;



        out.println("Set \"a\" length");
        Scanner aInner = new Scanner(in);
        out.println("Set \"b\" length");
        Scanner bInner = new Scanner(in);
        out.println("Set \"с\" length");
        Scanner cInner = new Scanner(in);

        a_side = aInner.nextDouble();
        b_side = bInner.nextDouble();
        c_side = cInner.nextDouble();

        if(c_side < 1e-6) {
            Rectangle rectangle = new Rectangle(a_side, b_side);
            out.println(rectangle);
        }else {
            Parallelepiped parallelepiped = new Parallelepiped(a_side, b_side, c_side);
            out.println(parallelepiped);
        }

//
        Rectangles.rectangleCreation();
        Rectangles.Outputting();
        Parallelepipeds.Outputting();
    }
