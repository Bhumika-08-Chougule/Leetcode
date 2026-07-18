package com.nt.leetcode;

import java.util.*;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        if(s.length() != t.length())
	        return false;

	        HashMap<Character , Integer > sMap = new HashMap<>();
	        HashMap<Character , Integer > tMap = new HashMap<>();

	        for(char ch : s.toCharArray()){
	            if(sMap.containsKey(ch)){
	                sMap.put(ch , sMap.get(ch)+1);
	            }
	            else{
	                sMap.put(ch , 1);
	            }
	        }

	        for(char ch : t.toCharArray()){
	            if(tMap.containsKey(ch)){
	                tMap.put(ch , tMap.get(ch)+1);
	            }
	            else{
	                tMap.put(ch , 1);
	            }
	        }

	        for(Map.Entry<Character , Integer > e : sMap.entrySet()){
	            if(!e.getValue().equals(tMap.get(e.getKey())))
	            return false;
	        }

	        return true ;
	        
	    }
	}
}
