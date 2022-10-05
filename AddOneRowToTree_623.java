// 623. Add One Row to Tree

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val, root, null);
            return newNode;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size;
        while (depth > 2) {
            depth--;
            size = queue.size();
            while (size > 0) {
                size--;
                TreeNode curNode = queue.remove();
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
        }
        size = queue.size();
        while (size > 0) {
            size--;
            TreeNode curNode = queue.remove();
            TreeNode newLeftNode = new TreeNode(val, curNode.left, null);
            curNode.left = newLeftNode;
            TreeNode newRightNode = new TreeNode(val, null, curNode.right);
            curNode.right = newRightNode;
        }
        return root;
    }
}
