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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null||subRoot==null) return root==subRoot;

        if (root.val == subRoot.val&&isSameTree(root, subRoot)) {return true;

        }

        return isSubtree(root.left, subRoot) 
            || isSubtree(root.right, subRoot);
    }

public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){return p==q;}
       
       
        boolean e=isSameTree(p.left,q.left);
        boolean t=isSameTree(p.right,q.right);

       return (e&&t&&p.val==q.val);
        }

   // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       // return findValue(root,subRoot);

   // }
}

