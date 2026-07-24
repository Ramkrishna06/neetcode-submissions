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
     public int  K;
    public int ans;
    public int kthSmallest(TreeNode root, int k) {

        this.K = k;
        helper(root);
        return ans;
    }
    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        K--;
        if(K == 0){
            ans = root.val;
            return;
        }
        helper(root.right);
    }
}
