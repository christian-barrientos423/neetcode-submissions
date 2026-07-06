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
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        if (root == null) {
            return false;
        }
        bfs.add(root);
        while(!bfs.isEmpty()) {
            TreeNode e = bfs.remove();
            if (e == null) {
                continue;
            }
            boolean same = sameTree(e, subRoot);
            if(same) {
                return true;
            }
            bfs.add(e.left);
            bfs.add(e.right);
        }
        return false;
    }

    public boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            boolean same1 = sameTree(root1.left, root2.left);
            boolean same2 = sameTree(root1.right, root2.right);
            return same1 && same2;
        }
        return false;
    }
}
