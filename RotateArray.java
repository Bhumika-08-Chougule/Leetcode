package com.nt.leetcode;

public class RotateArray {
	class Solution {
	    public void rotate(int[] nums, int k) {
	        
	        
	        k = k % nums.length;

	        if(k == 0)
	        return;

	        int split = nums.length - k;
	        int[] split_rigth = new int[k];
	        int[] split_left = new int[nums.length - k];
	        int index = 0;

	        for(int i = split ; i < nums.length ; i++ ){
	            if(index < split_rigth.length)
	                split_rigth[index++] = nums[i];
	        }

	        index = 0 ;

	        for(int m = 0 ; m < split ; m++){
	            if(index < split_left.length)
	                split_left[index++] = nums[m];
	        }


	        for(int  n = 0 ; n < split_rigth.length ; n++){
	            nums[n] = split_rigth[n];
	        }

	        index = 0;

	        for(int l = split_rigth.length ; l < nums.length ; l++){
	            if(index < split_left.length)
	                nums[l] = split_left[index++];
	        }

	    }
	}
}
