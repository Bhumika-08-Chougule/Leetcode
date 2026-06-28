package com.nt.leetcode;

class Solution26 {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int value : nums){
            sum += value;
        }
        return sum%k;
    }
}