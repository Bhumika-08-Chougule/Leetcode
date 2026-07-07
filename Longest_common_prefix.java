package com.nt.leetcode;

class Solution38 {
    public String longestCommonPrefix(String[] strs) {
       if( strs == null ||strs.length == 0  )
        return "";

        String prefix = strs[0];
        String ans= "";
        int flag;
        char ch;

        for(int i = 0 ; i <prefix.length() ; i++){
            ch = prefix.charAt(i);
            flag = 1;
            for(int j =1 ; j < strs.length ; j++){
                if( i >= strs[j].length() || strs[j].charAt(i) != ch){
                    flag =0 ;
                    break;
                }
            }

            if(flag == 1)
            ans += ch;
            else
            break;

        }
        return ans;
    }
}
