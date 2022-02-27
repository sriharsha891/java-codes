package com.java1;

public class foreach {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};
        int highest_marks = maxi(a);
        System.out.println("highest marks in the arrahy   " + highest_marks);
    }
    public static int maxi(int num[]){
        int max = num[0];
        for (int numb : num ){
            if (max < numb){
                max = numb;
            }
        }
        return max;
    }
}
