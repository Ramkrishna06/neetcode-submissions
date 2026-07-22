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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new LinkedList<>();

        if (root == null)
            return li;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        TreeNode lastNode = null;
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                li.add(lastNode.val);
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            } else {
                lastNode = curr;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return li;
    }
}
