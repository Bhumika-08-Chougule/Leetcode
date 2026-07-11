package com.nt.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	class Solution {
	    public List<String> generateParenthesis(int n) {
	        List<String> ans = new ArrayList<>();
	        backtracking(ans,"",0,0,n);
	        return ans;
	    }

	    public void backtracking(List<String> ans , String current , int open ,int close , int n){
	        if(current.length() == n*2){
	            ans.add(current);
	            return;
	        }

	        if(open < n){
	            backtracking(ans,current + "(",open+1,close,n);
	        }

	        if(close < open){
	            backtracking(ans,current + ")",open,close+1,n);
	        }
	    }
	}
	
}
