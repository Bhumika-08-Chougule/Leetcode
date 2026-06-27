package com.nt.leetcode;

import java.util.ArrayList;
import java.util.List;

 public class TreeNode_postorder {
     int val;
     TreeNode_postorder left;
     TreeNode_postorder right;
     TreeNode_postorder() {}
     TreeNode_postorder(int val) { this.val = val; }
     TreeNode_postorder (int val, TreeNode_postorder left, TreeNode_postorder right) {
      this.val = val;
         this.left = left;
        this.right = right;
     }
 }
class Solution3 {
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode_postorder root) {
        postorder(root);
        return list;
    }
    public void postorder(TreeNode_postorder node){
        if(node == null)
        return ;
        postorder(node.left);
        postorder(node.right);
        list.add(node.val);
    }
}