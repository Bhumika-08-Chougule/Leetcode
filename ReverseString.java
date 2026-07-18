package com.nt.leetcode;

public class ReverseString {

	class Solution {
	    public void reverseString(char[] s) {
	        
	        int left = 0;
	        int rigth = s.length - 1;
	        char temp ;

	        while(left < rigth){
	            temp = s[left];
	            s[left] = s[rigth];
	            s[rigth] = temp ;
	            left++;
	            rigth--;
	        }

	    }
	}
	
}
