/** 883. Projection Area of 3D Shapes */

class Solution883 {
    public int projectionArea(int[][] grid) {
        int topArea = 0;
        int leftArea = 0;
        int frontArea = 0;
        int[] left = new int[grid.length];
        int[] front = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int value = grid[i][j];
                if (value != 0) {
                    topArea++;
                }
                left[j] = left[j] > value ? left[j] : value;
                front[i] = front[i] > value ? front[i] : value;
            }
        }

        for (int leftv : left) {
            leftArea += leftv;
        }

        for (int frontv : front) {
            frontArea += frontv;
        }

        return topArea + leftArea + frontArea;

    }
}