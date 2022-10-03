// 144. Binary Tree Preorder Traversal

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        List<TreeNode> preorderNodes = preorder(root);
        for (int i = 0; i < preorderNodes.size(); i++) {
            ans.add(preorderNodes.get(i).val);
        }
        return ans;
    }
    
    public List<TreeNode> preorder(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        if (root.left != null) {
            nodes.addAll(preorder(root.left));
        }
        if (root.right != null) {
            nodes.addAll(preorder(root.right));
        }
        return nodes;
    }
}
