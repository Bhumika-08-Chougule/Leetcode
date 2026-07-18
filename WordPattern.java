package com.nt.leetcode;

import java.util.HashMap;

public class WordPattern {

	class Solution {
	    public boolean wordPattern(String pattern, String s) {

	        String[] word = s.split(" ");
	        HashMap<Character , String > map = new HashMap<>();
	        int i =0 ;

	        if(pattern.length() != word.length)
	            return false;

	        for(char ch : pattern.toCharArray()){
	        
	            if(!map.containsKey(ch)){
	                map.put(ch,word[i]);
	            }

	            i++;

	        }

	        String generate_pattern = "";

	        for(int j =0 ; j < word.length ; j++){
	            for(char key : map.keySet()){
	                if(map.get(key).equals(word[j])){
	                    generate_pattern = generate_pattern + key ;
	                    break;
	                }
	            }
	        }

	        if(generate_pattern.equals(pattern))
	            return true ;

	        return false;

	    }
	}

}
