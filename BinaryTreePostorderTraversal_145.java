// 145. Binary Tree Postorder Traversal

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        List<TreeNode> postorderNodes = postorder(root);
        for (int i = 0; i < postorderNodes.size(); i++) {
            ans.add(postorderNodes.get(i).val);
        }
        return ans;
    }
    
    public List<TreeNode> postorder(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        if (root.left != null) {
            nodes.addAll(postorder(root.left));
        }
        if (root.right != null) {
            nodes.addAll(postorder(root.right));
        }
        nodes.add(root);
        return nodes;
    }
}
