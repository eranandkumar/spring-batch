package com.problem.math;
/*
GCD (Greatest Common Divisor) or HCF (Highest Common Factor)
of two numbers is the largest number that divides both of them.
For ex --> 60, 75 is 15
 */
public class HCForGCD {
    // Driver method
    public static void main(String[] args)
    {
        int a = 98, b = 0;
        //System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));

        System.out.println("GCD of " + a +" and " + b + " is " + efficientHCF (a, b));
    }

    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    // Recursive function to return gcd of a and b
    static int efficientHCF(int a, int b)
    {
        if (b == 0)
            return a;
        return efficientHCF(b, a % b);
    }

}


