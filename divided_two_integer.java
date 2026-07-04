package com.nt.leetcode;
class Solution33 {
    public int divide(int dividend, int divisor) {
        int count =0 ;

         if(dividend >= Integer.MAX_VALUE && divisor == -1){
            return Integer.MIN_VALUE+1;
        }
        
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^(divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while(a >= b ){
            a = a - b;
            count += 1; 
        }

        return negative ? -count : count;
    }
}
public class divided_two_integer {

}
