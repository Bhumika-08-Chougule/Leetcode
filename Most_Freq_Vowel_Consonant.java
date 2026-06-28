package com.nt.leetcode;
class Solution17 {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        int maxV =0;
        int maxC = 0;

        for(char value : s.toCharArray()){
            arr[value - 97] += 1;
        }

        for(char ch = 'a' ; ch<='z'; ch++){
            
            if("aeiou".contains(ch + "")){
                maxV = Math.max(arr[ch-97] , maxV);
            }
            else{
                maxC = Math.max(arr[ch-97] , maxC);
            }
        }
        return maxV+maxC;
    }
}
