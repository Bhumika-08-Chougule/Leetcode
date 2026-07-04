package com.nt.leetcode;

import java.util.*;

class Solution34 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i,left,right;
        int sum =0 ;

        for(i=0 ; i<nums.length-2; i++){

            left = i+1;
            right = nums.length-1;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;
                
            while(left < right){
                    sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                         left++;

                         while (left < right && nums[right] == nums[right + 1])
                         right--;
                    }
                    else{
                        if(sum < 0){
                            left++;
                        }
                        else{
                            right--;
                        }
                    }
                }
        }
        return result;
    }
}
