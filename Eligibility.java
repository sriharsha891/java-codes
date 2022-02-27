package com.java1;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Q:Define a method to find out if he/she is eligible to vote.
        System.out.println("Enter your age: ");
        int age = in.nextInt();
       if (voteage(age)== true){
           System.out.println("yes Eligible");
       }else{
           System.out.println("not eligible");
       }
    }
    static boolean voteage(int n){
        return n >= 18;
    }
}
