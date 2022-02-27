package com.java1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("sum of two numbers using functions/methods..");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float num1 = in.nextFloat();
        System.out.print("Enter num2: ");
        float num2 = in.nextFloat();
        float ans = add(num1,num2);
        System.out.println("sum of two numbers: "+ans);

    }
    static float add(float n1,float n2){
        return  n1+n2;


    }
}
