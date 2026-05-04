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
    List<Integer> result = new ArrayList<>();
    public void dfs(TreeNode root, List<Integer> result) {
        if (root == null) return;

               // 1. Root
        dfs(root.left, result);
         result.add(root.val); // 2. Left
        dfs(root.right, result);   // 3. Right
    }
    public int kthSmallest(TreeNode root, int k) {

        dfs(root,result);
        //result.sort(null);
        return result.get(k-1);


        
    }
}
