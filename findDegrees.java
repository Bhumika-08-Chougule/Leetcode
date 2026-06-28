package com.nt.leetcode;

class Solution27 {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        int sum;
        int index=0;
        
        for(int [] row : matrix){
            sum =0;
            for(int value : row){
                sum += value;
            }
            ans[index++] = sum;
        }
        return ans;
    }
}