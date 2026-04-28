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
    //int c=0;
    public int maxDepth(TreeNode root) {
        

        if (root == null) return 0;
        int c=0;
        //count=count+1;
        // recurse
        int a=1+maxDepth(root.left);
        int b=1+maxDepth(root.right);
         c =  c + Math.max(a,b);

        return c;
    }
}
       
