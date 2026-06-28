package com.nt.leetcode;


class Solution13 {
    public int lengthOfLastWord(String s) {
        String[] sb = s.trim().split(" ");
        return sb[sb.length -1].length();
    }
}
