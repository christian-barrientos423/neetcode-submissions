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
        List<Integer> output = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()) {
            int size = bfs.size();
            for(int i = 0; i < size; i++) {
                TreeNode removed = bfs.remove();
                if (removed != null) {
                if (i == 0) {
                output.add(removed.val);
                }

                if (removed.right != null) {
                    bfs.add(removed.right);
                }
                if (removed.left != null) {
                    bfs.add(removed.left);
                }
                }
            }
              
        }
        return output;
    }

    
}
