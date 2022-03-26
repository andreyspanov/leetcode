package leetcode.leetcode733;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (newColor != oldColor) {
            fill(image, sr, sc, newColor, oldColor);
        }
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            if (image[sr].length > sc + 1) {
                fill(image, sr, sc + 1, newColor, oldColor);
            }
            if (sc > 0) {
                fill(image, sr, sc - 1, newColor, oldColor);
            }
            if (image.length > sr + 1) {
                fill(image, sr + 1, sc, newColor, oldColor);
            }
            if (sr > 0) {
                fill(image, sr - 1, sc, newColor, oldColor);
            }
        }
    }

    public static int[][] floodFillByQueue(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (newColor == oldColor) {
            return image;
        }
        int m = image.length;
        int n = image[0].length;
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(sr, sc));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int row = pair.row;
            int col = pair.col;
            if (image[row][col] != newColor) {
                image[row][col] = newColor;
                //up
                if (row > 0 && image[row - 1][col] == oldColor) {
                    queue.add(new Pair(row - 1, col));
                }
                //down
                if (row < m - 1 && image[row + 1][col] == oldColor) {
                    queue.add(new Pair(row + 1, col));
                }
                //left
                if (col > 0 && image[row][col - 1] == oldColor) {
                    queue.add(new Pair(row, col - 1));
                }
                //right
                if (col < n - 1 && image[row][col + 1] == oldColor) {
                    queue.add(new Pair(row, col + 1));
                }
            }
        }
        return image;
    }

    private static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}