// 94. Binary Tree Inorder Traversal

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        List<TreeNode> inorderNodes = inorder(root);
        for (int i = 0; i < inorderNodes.size(); i++) {
            ans.add(inorderNodes.get(i).val);
        }
        return ans;
    }
    
    public List<TreeNode> inorder(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        if (root.left != null) {
            nodes.addAll(inorder(root.left));
        }
        nodes.add(root);
        if (root.right != null) {
            nodes.addAll(inorder(root.right));
        }
        return nodes;
    }
}
