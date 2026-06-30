package com.nt.leetcode;


 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int x,y;
        int sum,digit ;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy ;

        while(l1 != null || l2 != null || carry != 0){
            x = (l1 != null ) ? l1.val : 0;
            y = (l2 != null ) ? l2.val : 0;

            sum = x + y + carry;
            digit = sum % 10;
            carry = sum / 10;

            current.next = new ListNode(digit);
             current = current.next;

             if(l2 != null){
                l2 = l2.next ;
             }

             if(l1 != null){
                l1 = l1.next;
             }
        }
        return dummy.next;
    }
}

