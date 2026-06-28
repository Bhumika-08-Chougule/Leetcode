package com.nt.leetcode;

class Solution21 {
    public int[] transformArray(int[] nums) {
        int temp=0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0 ;
            }
            else{
                nums[i] = 1;
            }
        }
        for(int j =0 ; j < nums.length-1; j++){
            for(int k=j+1 ; k < nums.length ; k++){
            if(nums[k] < nums[j]) {
                temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
            }
            }
        }
        return nums;
    }
}