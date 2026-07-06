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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode e1 = q1.remove();
            TreeNode e2 = q2.remove();
            if (e1 == null && e2 == null)  {
                continue;
            }
            if (e1 == null || e2 == null) {
                return false;
            }
            if (e1.val != e2.val) {
                return false;
            }
            q1.add(e1.left);
            q1.add(e1.right);
            q2.add(e2.left);
            q2.add(e2.right);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}
