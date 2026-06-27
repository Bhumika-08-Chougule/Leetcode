package com.nt.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode_inorder {
      int val;
      TreeNode_inorder left;
      TreeNode_inorder right;
      TreeNode_inorder() {}
      TreeNode_inorder(int val) { this.val = val; }
      TreeNode_inorder(int val, TreeNode_inorder left, TreeNode_inorder right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode_inorder root) {
        inorder(root);
        return list;
    }
    public void inorder(TreeNode_inorder node){
        if(node == null){
            return;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

}
