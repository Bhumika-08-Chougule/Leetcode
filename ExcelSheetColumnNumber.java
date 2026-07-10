package com.nt.leetcode;

public class ExcelSheetColumnNumber {
	class Solution {
	    public int titleToNumber(String columnTitle) {
	        int columnNum = 0;
	        for(int i = 0; i < columnTitle.length(); i++){
	            int num = columnTitle.charAt(i)-'A'+1;
	            columnNum = columnNum * 26+ num;
	        }
	        return columnNum;
	    }
	}
}
