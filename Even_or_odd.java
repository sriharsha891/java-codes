package com.java1;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = iseven(num);
        System.out.println(ans);
    }
    static boolean iseven(int n){
        return n%2 == 0;
    }

}
