package com.company.Classes;

public class Rectangles {

    private static final int NUMOFRECTANGLES = 10;

    public Rectangles() {
    }

    //  создание и инициализация массива прямоугольников
    public static Rectangle[] miniRectangle /**/= new Rectangle[NUMOFRECTANGLES];

    public static void rectangleCreation(){
        miniRectangle[0] = new Rectangle(2.0d, 3.0d);
        miniRectangle[1] = new Rectangle(3.0d, 4.0d);
        miniRectangle[2] = new Rectangle(4.0d, 5.0d);
        miniRectangle[3] = new Rectangle(12.0d, 14.0d);
        miniRectangle[4] = new Rectangle(17.0d, 15.0d);
        miniRectangle[5] = new Rectangle(18.0d, 3.0d);
        miniRectangle[6] = new Rectangle(9.0d, 10.0d);
        miniRectangle[7] = new Rectangle(4.0d, 5.0d);
        miniRectangle[8] = new Rectangle(10.0d, 23.0d);
        miniRectangle[9] = new Rectangle(13.0d, 14.0d);
    }

    //  возврат средней площади
    private static double getAverageArea(){
        double sum=0;
        for (int i = 0; i < NUMOFRECTANGLES; i++){
            sum += miniRectangle[i].Area();
        }
        sum /= NUMOFRECTANGLES;
        int iterator = 0;
        for (int i = 0; i < NUMOFRECTANGLES; i++){
            if(miniRectangle[i].Area() > sum /*getAverageArea()*/) iterator++;
        }
        return iterator;
    }

    //  результат
    public static void Outputting(){
        System.out.println(getAverageArea());
        System.out.println("\n\nNumber of rectangles with area higher than intermediate is " + getAverageArea());
    }


    @Override
    public String toString() {
        return "\n\nNumber of rectangles with area higher than intermediate is " + getAverageArea();
    }
}