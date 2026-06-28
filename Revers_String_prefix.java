package com.nt.leetcode;

class Solution20 {
    public String reversePrefix(String s, int k) {
        StringBuilder a = new StringBuilder(s.substring(0,k));
        String b = s.substring(k);

        s = a.reverse().toString();
        return s+b;
    }
}
