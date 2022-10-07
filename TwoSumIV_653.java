// 653. Two Sum IV - Input is a BST

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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> values = new HashSet<>();
        return traverse(root, k, values);
    }
    
    public boolean traverse(TreeNode root, int k, HashSet<Integer> values) {
        if (root == null) {
            return false;
        }
        if (values.contains(root.val)) {
            return true;
        } else {
            values.add(k - root.val);
        }
        return traverse(root.left, k, values) || traverse(root.right, k, values);
    }
}
