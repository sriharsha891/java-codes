package com.java1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your usn:");
        String usn = in.nextLine();

        System.out.println("enter your name:");
        String name = in.nextLine();
        System.out.println("enter your Phone number:");
        String num = in.next();
        System.out.println(usn);
        System.out.println(name);
        System.out.println("enter your branch:");
        String branch = in.next();
        System.out.println(branch);


    }
}
