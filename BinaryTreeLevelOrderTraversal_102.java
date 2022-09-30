// 102. Binary Tree Level Order Traversal

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
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (queue.isEmpty() == false) {
                int size = queue.size();
                ArrayList<Integer> curLevel = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode curNode = queue.remove();
                    curLevel.add(curNode.val);
                    if (curNode.left != null) {
                        queue.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        queue.add(curNode.right);
                    }
                }
                ans.add(curLevel);
            }
        }
        return ans;
    }
}
