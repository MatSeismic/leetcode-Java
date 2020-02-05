class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] ordered = heights.clone();
        Arrays.sort(ordered);
        for (int i = 0; i < heights.length; i++) {
            if (ordered[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}