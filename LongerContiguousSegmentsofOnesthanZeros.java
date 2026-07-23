package com.nt.leetcode;

public class LongerContiguousSegmentsofOnesthanZeros {

	
	class Solution {
	    public boolean checkZeroOnes(String s) {

	        int countOne = 0;
	        int countZero = 0;
	        int maxOne = 0;
	        int maxZero = 0 ;

	        for(int i =0 ; i < s.length() ; i++){

	            if( s.charAt(i) == '1'){
	                countOne += 1;
	            }
	            
	            if(s.charAt(i) == '0'){
	                maxOne = Math.max(maxOne, countOne );
	                countOne =0 ;
	            }

	        }

	        maxOne = Math.max(maxOne, countOne );

	        for(int i =0 ; i < s.length() ; i++){

	            if( s.charAt(i) == '0'){
	                countZero += 1;
	            }
	            
	            if(s.charAt(i) == '1'){
	                maxZero = Math.max(maxZero, countZero );
	                countZero =0 ;
	            }

	        }
	        maxZero = Math.max(maxZero, countZero);

	        if(maxOne > maxZero)
	        return true;

	    return false;
	    }
	}
	
	
}
