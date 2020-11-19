package com.company.Classes;

public class Parallelepipeds {

    public static Parallelepiped[] miniBox = new Parallelepiped[15];


    //  инициализация
    public static void boxCreation() {
        miniBox[0] = new Parallelepiped(2.0d, 3.0d, 2.0d);
        miniBox[1] = new Parallelepiped(3.0d, 3.0d, 3.0d);      // куб
        miniBox[2] = new Parallelepiped(4.0d, 5.0d, 16.0d);
        miniBox[3] = new Parallelepiped(12.0d, 14.0d, 2.0d);
        miniBox[4] = new Parallelepiped(17.0d, 15.0d, 16.0d);
        miniBox[5] = new Parallelepiped(18.0d, 3.0d, 19.0d);
        miniBox[6] = new Parallelepiped(9.0d, 10.0d, 11.0d);
        miniBox[7] = new Parallelepiped(4.0d, 5.0d, 1.0d);
        miniBox[8] = new Parallelepiped(10.0d, 23.0d, 11.0d);
        miniBox[9] = new Parallelepiped(13.0d, 13.0d, 13.0d);   //  куб
        miniBox[10] = new Parallelepiped(18.0d, 3.0d, 19.0d);
        miniBox[11] = new Parallelepiped(9.0d, 10.0d, 11.0d);
        miniBox[12] = new Parallelepiped(4.0d, 5.0d, 1.0d);
        miniBox[13] = new Parallelepiped(10.0d, 23.0d, 11.0d);
        miniBox[14] = new Parallelepiped(13.0d, 13.0d, 13.0d);  //  куб
    }

    public static int cubeSelection(){
        int iterator = 0;
        for(int i = 0; i < miniBox.length; i++){
            if(miniBox[i].getA_side() == miniBox[i].getB_side() && miniBox[i].getB_side() == miniBox[i].getC_side()){
                iterator++;
            }
        }
        return iterator;
    }

    public static void Outputting(){
        System.out.println("\n\nNumber of cubes " + cubeSelection());
    }

}
