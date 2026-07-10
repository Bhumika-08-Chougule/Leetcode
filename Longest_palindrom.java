package com.nt.leetcode;

class Solution44 {
    public String longestPalindrome(String s) {

        String ans = s.substring(0,1);

        if(s.length() == 1 )
            return s;

        for(int i =0 ; i<s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    String sub = s.substring(i,j+1);
                    StringBuilder str =new StringBuilder(sub);
                    String rev = str.reverse().toString();
                    if(sub.equals(rev) && sub.length() > ans.length())
                        ans = sub;
                }
            }
        }
        return ans;
    }
}

public class Longest_palindrom {

}
