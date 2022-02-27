package com.java1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        float num1 = in.nextFloat();
        System.out.println("Enter num2: ");
        float num2 = in.nextFloat();
        float pro = product(num1,num2);
        System.out.println("product of two numbers: "+pro);

    }
    static float product(float n1,float n2){
        return n1*n2;

    }
}
