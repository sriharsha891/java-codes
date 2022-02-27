package com.java1;

public class bitwiseoperatrors {
    public static void main(String[] args) {
        // inputs
        int a = 5;
        int b = 7;
        // bit wise operators
        //OR operator
        System.out.println("Or operator of a|b "+(a|b));
        // and operator
        System.out.println("AND operator of a&b "+(a&b));
        // XOR operator
        System.out.println("XOR operator of a^b "+ (a^b));
        // Compliment operator
        System.out.println("uniary operator of ~b "+(~b));
        // assignment operators
        // = operator
        System.out.println("variable of a " + a);
        // += op
        a+=b;
        System.out.println("variable of +=a " + a);
        a-=b;
        System.out.println("variable of -=a " + a);
        a*=b;
        System.out.println("variable of *=a " + a);
        a/=b;
        System.out.println("variable of /=a " + a);
        a%=b;
        System.out.println("variable of %=a " + a);
    }
}
