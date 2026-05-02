/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count=0; 
   // int pre=null;
    public int good(TreeNode root ,int pre2) {
      //  pre=root;
        if(root==null){return 0;}
        if(root.val>=pre2){ count=count+1;}
        int pre1=Math.max(root.val,pre2);
        //if(root.right==null){return 0;}
        //if(root.val<root.left.val){count=count+1;}
        //if(root.val<root.right.val){count=count+1;}
        good(root.left,pre1);
        good(root.right,pre1);

        return count;
       
    } public int goodNodes(TreeNode root){
             good(root,root.val);
             return count;
        }
}
