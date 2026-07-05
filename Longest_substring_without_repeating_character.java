package com.nt.leetcode;

import java.util.HashSet;

class Solution35 {
    public int lengthOfLongestSubstring(String s) {
        
        int max =0;
        int i,j;
        for(i =0 ; i < s.length() ; i++){
            HashSet<Character> set = new HashSet<>();
            for(j = i ; j < s.length() ; j++){
                if(set.contains(s.charAt(j)))
                   { set.remove(s.charAt(j));
                     break;
                   }

                 set.add(s.charAt(j));
                 max = Math.max(max,j-i+1);
            }
           
        }
        return max; 
    }
}