package com.nt.leetcode;

class Solution41 {
    public int singleNumber(int[] nums) {

        int res=0 ;
        for(int i =0 ; i < nums.length; i++){
        int flag =0 ;
            for(int j =0 ; j< nums.length ; j++){
                if(i != j && nums[i] == nums[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                {res = nums[i];
                break;}
        }
        return res;
    }
}

public class Single_Number {

}
