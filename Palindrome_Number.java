package com.nt.leetcode;

class Solution6 {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev=0;
        while(x > 0){
            rev = rev*10 + x % 10 ;
            x = x /10;
        }
        if(original == rev)
            return true;
        return false;
    }
}
