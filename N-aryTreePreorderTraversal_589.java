// 589. N-ary Tree Preorder Traversal

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            System.out.println(root.val);
            result.add(root.val);
            for (Node node: root.children) {
                List<Integer> nodeList = preorder(node);
                for (int curNode: nodeList) {
                    result.add(curNode);
                }
            }
        }
        return result;
    }
}
