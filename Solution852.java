/**
 * 852. Peak Index in a Mountain Array binary search is adopted so that the time
 * complexity is reduced to O(logN)
 */

class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (A[mi] < A[mi + 1]) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return lo;
    }
}