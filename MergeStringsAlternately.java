package com.nt.leetcode;

public class MergeStringsAlternately {

	
	
class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int size = word1.length()+ word2.length();

        char [] merge = new char[size];

        int i = 0;
        int j =0 ;
        int k =0 ;

        while(i < word1.length() && j < word2.length() ){
                merge[k++] = word1.charAt(i++);
                merge[k++] = word2.charAt(j++);
            
        }
        while(i < word1.length() ){
            merge[k++] = word1.charAt(i++);
        }
        while(j < word2.length()  ){
            merge[k++] = word2.charAt(j++);
        }

        return String.valueOf(merge);
    }
}}
