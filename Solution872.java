/**
 * 872. Leaf-Similar Trees Definition for a binary tree node. public class
 * TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x;
 * } }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList();
        List<Integer> leaves2 = new ArrayList();
        findLeafNode(root1, leaves1);
        findLeafNode(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    private void findLeafNode(TreeNode p, List l) {
        if (p == null) {
            return;
        }
        if (p.left == null && p.right == null) {
            l.add(String.valueOf(p.val));
            return;
        } else {
            findLeafNode(p.left, l);
            findLeafNode(p.right, l);
        }
    }
}