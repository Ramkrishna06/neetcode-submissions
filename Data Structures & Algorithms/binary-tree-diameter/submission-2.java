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
    public int heightBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int left = heightBinaryTree(root.left);
        int right = heightBinaryTree(root.right);

        return Math.max(left , right) +1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = heightBinaryTree(root.left);
        int rightHeight = heightBinaryTree(root.right);
        
        int currdia = leftHeight + rightHeight;

        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(leftdia , rightdia) , currdia);
    }
}
