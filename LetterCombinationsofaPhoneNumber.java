package com.nt.leetcode;
import java.util.*;

class Solution43 {

    List<String> ans = new ArrayList<>();

    String[] map = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return ans;

        backstracking(digits,0,new StringBuilder());
        return ans;
    }

    public void  backstracking(String digits , int index , StringBuilder curr){
        if(index == digits.length()){
            ans.add(curr.toString());
            return;
        }
        String letter = map[digits.charAt(index)-'0'];

        for(char ch : letter.toCharArray()){
            curr.append(ch);
            backstracking(digits,index+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}

public class LetterCombinationsofaPhoneNumber {

}
