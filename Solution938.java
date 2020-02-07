class Solution938 {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        sumHelper(root, L, R);
        return sum;

    }

    private void sumHelper(TreeNode p, int L, int R) {
        if (p != null) {
            if (p.val >= L && p.val <= R) {
                sum += p.val;
            }
            if (p.val > L)
                sumHelper(p.left, L, R);
            if (p.val < R)
                sumHelper(p.right, L, R);
        }

    }

}