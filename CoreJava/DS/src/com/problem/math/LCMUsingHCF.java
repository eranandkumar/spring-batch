package com.problem.math;
/*
LCM (Least Common Multiple) of two numbers is the smallest number which can be divided by both numbers.
Ex -->  60,75 --> 300
 */
public class LCMUsingHCF {
    public static void main(String[] args) {
       System.out.println ("LCM of " +60 +"," +75+"  --> " +lcm ( 60, 75 ));
    }
    public static int lcm(int a, int b){
        return (a * b) / HCForGCD.gcd ( a, b );
    }

}
