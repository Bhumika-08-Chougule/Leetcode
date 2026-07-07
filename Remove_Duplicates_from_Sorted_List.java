package com.nt.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution39 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while(list != null && list.next != null){
        if(list.val == list.next.val){
            list.next = list.next.next;
        }
        else{
            list = list.next;
        }
        }
         return head;
    }
}

public class Remove_Duplicates_from_Sorted_List {

}
