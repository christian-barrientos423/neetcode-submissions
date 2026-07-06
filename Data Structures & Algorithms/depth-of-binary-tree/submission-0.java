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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(getDepth(root.left, 1), getDepth(root.right, 1));
    }

    public int getDepth(TreeNode root, int length) {
        if(root == null) {
            return length;
        }
        return Math.max(getDepth(root.left, length + 1), getDepth(root.right, length + 1));
        
    }
}
