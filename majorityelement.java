package com.nt.leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class majorityelement {
	class Solution {
	    public int majorityElement(int[] nums) {

	        HashMap<Integer,Integer> map = new HashMap<>();

	        int ans = nums.length/2;
	        
	        for(int num : nums){
	            map.put(num, map.getOrDefault(num,0)+1);
	        }

	        for(Entry<Integer, Integer> entry : map.entrySet()){
	            if(entry.getValue() > ans)
	                return entry.getKey();
	        }
	        return -1;
	    }
	}
}
