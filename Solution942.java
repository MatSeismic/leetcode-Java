/** 942. DI String Match */

class Solution942 {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] res = new int[N + 1];
        int lo = 0;
        int hi = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'D') {
                res[i] = hi;
                hi--;
            } else {
                res[i] = lo;
                lo++;
            }
        }
        res[N] = lo;
        return res;
    }
}