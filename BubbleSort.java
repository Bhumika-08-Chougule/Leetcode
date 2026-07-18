package com.nt.leetcode;

public class BubbleSort {

	class Solution {
	    public int[] sortArray(int[] nums) {

	        int temp =0 ;
	        int flag = 0;

	        for(int i =0 ; i < nums.length ; i++){

	             flag = 0;

	            for (int j = 0 ; j < nums.length- i-1; j++){
	                if(nums[j] > nums[j+1]){
	                    temp = nums[j];
	                    nums[j] = nums[j+1];
	                    nums[j+1] = temp;
	                    flag = 1;
	                }
	            }

	            if (flag == 0){
	                break;
	            }


	        }

	        return nums;
	    }
	}
	
}
