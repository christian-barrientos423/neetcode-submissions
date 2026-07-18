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
        if (root == null) {
            return 0;
        }
        return helper(root, root.val);
    }

    public int helper(TreeNode root, int maxSeenSoFar) {
        if(root == null) {
            return 0;
        }
        if(root.val >= maxSeenSoFar) {
            return 1 + helper(root.left, Math.max(root.val, maxSeenSoFar)) + helper(root.right, Math.max(root.val,maxSeenSoFar));
        }
        return helper(root.left, Math.max(root.val, maxSeenSoFar)) + helper(root.right, Math.max(root.val,maxSeenSoFar));
    }
}
