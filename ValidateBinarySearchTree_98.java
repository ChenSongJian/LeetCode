// 98. Validate Binary Search Tree

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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList = inOrder(root);
        for (int i = 0; i < inOrderList.size() - 1; i++) {
            if (inOrderList.get(i) >= inOrderList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> curList = new ArrayList<>();
        if (root == null) {
            return curList;
        }
        if (root.left != null) {
            curList.addAll(inOrder(root.left));
        }
        curList.add(root.val);
        if (root.right != null) {
            curList.addAll(inOrder(root.right));
        }
        return curList;
    }
}

