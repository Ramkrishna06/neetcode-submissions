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
    public int goodNodes(TreeNode root) {
        int min = Integer.MIN_VALUE;
        return helper(root , min);
    }
    public int helper(TreeNode root , int currmax) {
        if(root == null ) return 0;

        int rootans = 0;
        if(root.val >= currmax){
            rootans = 1;
            currmax = root.val;
        }

        int left=helper(root.left , currmax);
        int right=helper(root.right , currmax);
        return left+ right + rootans;
    }
}
