package com.nt.leetcode;

class Solution11 {
    
    int removeElement(int[] nums, int val) {
    	   int k=0;
    	    for(int i=0;i<nums.length;i++)
    	    {
    	        
    	        if(nums[i]!=val)
    	        {
    	            nums[k++]=nums[i];
    	        }

    	    }
    	    return k;
    	}
}

