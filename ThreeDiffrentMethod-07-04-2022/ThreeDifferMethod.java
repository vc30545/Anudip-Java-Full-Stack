package com.company;


import java.awt.geom.Area;
import java.util.Scanner;

//Write a class . Inside the class declare 3 method with different signature but same name. Each of the method will
//perform specific task as caled from the main by the user.
//first method will calculate the area of a circle
//second method will calculate the area of rectangle
//third method will calculate the area of box
public class ThreeDifferMethod {

    static double Area(double x , int y){
        double circle = x * (y*y);
        return  circle;
    }
    static int Area(int length , int width){
        int rectangle =length*width;
        return rectangle;
    }
    static int Area(int length , int width , int height){
        int Box =length*width*height;
        return Box;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius Of a circle");
        int radius = sc.nextInt();
        double pi = 3.14;
        System.out.println("Enter the value of width and length and height");
        int w = sc.nextInt();
        int l = sc.nextInt();
        int h = sc.nextInt();
        ThreeDifferMethod obj = new ThreeDifferMethod();
        System.out.println("Area of circle is : "+obj.Area(pi,radius));
        System.out.println("Area of Rectangle is : "+obj.Area(w,l));
        System.out.println("Area of Box is : "+obj.Area(w,l,h));


    }
}
