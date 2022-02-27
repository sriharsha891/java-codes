package com.java1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of radius: ");
        float rad = in.nextFloat();
        circle(rad);

    }
    static void circle(float r){
        double area = 3.14*r*r;
        double circumference = 2*3.14*r;
        System.out.println("Area of the circle: "+area);
        System.out.print("Circumference of circle: "+circumference);
    }
}
