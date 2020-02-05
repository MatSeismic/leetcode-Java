/** Recursion solution for 965. Univalued Binary Tree */

class Solution965 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode p) {
        boolean isCorrectLeft = (p.left == null || p.left.val == p.val && isUnivalTree(p.left));
        boolean isCorrectRight = (p.right == null || p.right.val == p.val && isUnivalTree(p.right));
        return isCorrectLeft && isCorrectRight;
    }
}