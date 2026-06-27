package com.nt.leetcode;

import java.util.ArrayList;
import java.util.List;


  public class TreeNode_preorder {
      int val;
      TreeNode_preorder left;
      TreeNode_preorder right;
     TreeNode_preorder() {}
      TreeNode_preorder(int val) { this.val = val; }
      TreeNode_preorder(int val, TreeNode_preorder left, TreeNode_preorder right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution2 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode_preorder root) {
        preorder(root);
        return list;
    }

    public void preorder(TreeNode_preorder node){
        if(node == null)
        return ;
        list.add(node.val);
        preorder(node.left);
        preorder(node.right);
        
    }
}