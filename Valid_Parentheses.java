package com.nt.leetcode;

import java.util.Stack;

class Solution9 {
    public boolean isValid(String s) {
        
        Stack<Character> vaild = new Stack<>();

        for(char str : s.toCharArray()){

            if(str == '(' || str == '[' || str == '{'){
                vaild.push(str);
            }
            else {
            if(vaild.isEmpty())
                return false;
            char top = vaild.peek();

            if(
                (str == ')' && top != '(') ||
                (str == ']' && top != '[') ||
                (str == '}' && top != '{') 
            )
                return false;

            vaild.pop();
        }
        }
            return vaild.isEmpty();
        
    }
}