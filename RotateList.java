package com.nt.leetcode;

public class RotateList {

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
	    public ListNode rotateRight(ListNode head, int k) {

	        if(head == null || head.next == null || k == 0)
	            return head;
	            
	        int count = 0;
	        ListNode list = head;

	        while(list != null){
	            count += 1;
	            list = list.next;
	        }

	        k = k % count;

	        while(k > 0){
	            ListNode prev = head;
	            ListNode curr = head;

	            while(curr.next != null){
	                prev = curr;
	                curr = curr.next;
	            }

	            curr.next = head;
	            head = curr;
	            prev.next = null;

	            k--;
	        }

	        return head;
	    }
	}
	
}
