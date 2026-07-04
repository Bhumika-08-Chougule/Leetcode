package com.nt.leetcode;
/*
public class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
     }*/
 
class Solution29 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode current = list3;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }
        else{
            current.next = list2;
        }

        return list3.next;
    }
}