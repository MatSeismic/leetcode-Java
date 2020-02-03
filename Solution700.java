/**
 * 700: binary search tree
 * 
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode p = root;
        if (p == null) {
            return null;
        } else {
            if (p.val == val) {
                return p;
            } else if (p.val < val) {
                return searchBST(p.right, val);
            } else if (p.val > val) {
                return searchBST(p.left, val);
            }
        }

        return null;
    }

}
