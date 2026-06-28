package com.nt.leetcode;

public class jewels_and_Stones {
	class Solution16 {
	    public int numJewelsInStones(String jewels, String stones) {
	        int count =0;
	        for(char ch : stones.toCharArray()){
	            if(jewels.contains(ch + "")){
	                    count += 1;
	            }
	        }
	        return count;
	    }
	}}