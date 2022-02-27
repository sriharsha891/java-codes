package com.java1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        for(int i =2; i < num ; i++){
            if (i<num){
                if(num%2 == 0){
                    System.out.println("not prime");
                }else{
                    System.out.println("prime");
                }
            }

        }

    }
}
