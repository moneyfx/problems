/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftMax = root.left == null ? 0 : maxDepth(root.left);
        int rightMax = root.right == null ? 0 : maxDepth(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }
}
