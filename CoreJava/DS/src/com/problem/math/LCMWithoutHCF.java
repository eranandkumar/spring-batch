package com.problem.math;

public class LCMWithoutHCF {
    public static void main(String[] args) {
        System.out.println (findLCM ( 5, 7 ));
    }
    public static int findLCM(int a, int b){
        int max = Math.max ( a, b );
        int min = Math.min ( a, b );

        for(int i = max; ;i=i+max){
            while (i % min == 0){
                return i;
            }
        }
    }
}
