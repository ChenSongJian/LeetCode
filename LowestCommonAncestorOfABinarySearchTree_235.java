// 235. Lowest Common Ancestor of a Binary Search Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val) {
            return p;
        } else if (root.val == q.val) {
            return q;
        } else if (root.val < p.val) {
            if (root.val < q.val) {
                return lowestCommonAncestor(root.right, p, q);
            } else {
                return root;
            }
        } else {
            if (root.val < q.val) {
                return root;
            } else {
                return lowestCommonAncestor(root.left, p, q);
            }   
        }
    }
}
