package com.nt.leetcode;

public class ExcelSheetColumnTitle {
	class Solution {
	    public String convertToTitle(int columnNumber) {
	        StringBuilder res = new StringBuilder("");
	        int rem =0;
	        while(columnNumber > 0){
	            columnNumber--;
	            rem = columnNumber % 26;
	            char ch = (char)('A' + rem);
	                 res.append(ch);
	            columnNumber = columnNumber/26;
	        }
	        return res.reverse().toString();
	    }
	}
}
