package com.nt.leetcode;

class Solution40 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int index =0;
        int i =0 ; 
        int j =0;
       
        while(i<m && j<n){
            if(nums1[i] <= nums2[j])
                ans[index++] = nums1[i++];
            else
                ans[index++] = nums2[j++];
        }

        while(i < m){
            ans[index++] = nums1[i++];
        }

        while(j<n){
            ans[index++] = nums2[j++];
        }

        
        for(int k =0 ; k < m+n ; k++){
            nums1[k] = ans[k]; 
        }
        
    }
}

public class Merge_sorted_array {

}
