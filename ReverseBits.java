package com.nt.leetcode;

public class ReverseBits {
	class Solution {
	    public int reverseBits(int n) {
	        String bin = Integer.toBinaryString(n);

	        while(bin.length() < 32){
	            bin = "0"+ bin ;
	        }

	        //System.out.print(bin);
	        StringBuilder sb = new StringBuilder(bin);

	         bin = sb.reverse().toString();

	         int number = Integer.parseInt(bin , 2);

	        return number;
	    }
	}
}
