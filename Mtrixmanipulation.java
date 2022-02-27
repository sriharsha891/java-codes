package com.java1;

public class Mtrixmanipulation {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        // average of diagnol elements
        float avg = (a[1][1] + a[0][0] + a[2][2])/3f;
        System.out.println("Average of diagnol elements " + avg);
        // smallest element in third coloumn
        int small = a[0][2];
        System.out.println("Smallest elemnt in third column " + small);
        // Greatest elemnt in A
        int great = a[2][2];
        System.out.println("Greatest element in matrix A " + great);

    }
}
