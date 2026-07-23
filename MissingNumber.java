package com.nt.leetcode;

public class MissingNumber {

	class Solution {
	    public int missingNumber(int[] nums) {

	        int[] hash = new int[nums.length + 1];

	        for(int i =0 ;i <nums.length ; i++ ){
	            int flag = nums[i];
	            hash[flag] = -1;
	        }

	        for(int j =0 ; j < hash.length ; j++){
	            if(hash[j] != -1){
	                return j ;
	            }
	        }

	        return -1;
	    }
	}
	
	
}
