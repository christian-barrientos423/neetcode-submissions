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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        if(root == null) {
            return lists;
        }
        bfs.add(root);
        while(!bfs.isEmpty()) {
            List<Integer> list = new ArrayList();
            int size = bfs.size();
            for (int i = 0; i < size; i++) {
                TreeNode element = bfs.remove();
                if (element != null) {
                    list.add(element.val);
                    bfs.add(element.left);
                    bfs.add(element.right);
                }
            }
            if (list.size() > 0) {
                lists.add(list);
            }
        }
        return lists;
    }
}
