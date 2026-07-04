package com.nt.leetcode;
class Solution32 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.replaceAll("[,: ]", "").toLowerCase());
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder(sb);
         System.out.print(sb1);

        sb1.reverse();

        if(sb1.equals(sb)){
            return true;
        }
        return false;
    }
}
public class WordValidParanthe {

}
