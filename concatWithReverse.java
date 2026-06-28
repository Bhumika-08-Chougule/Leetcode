package com.nt.leetcode;

class Solution24 {
    public int[] concatWithReverse(int[] nums) {
        int [] ans = new int[nums.length *2];

        for(int i =0 ; i < ans.length /2 ; i++){
            ans[i] = nums[i];
            ans[ans.length-(i+1)] = nums[i];
        }
        return ans;
    }
}
