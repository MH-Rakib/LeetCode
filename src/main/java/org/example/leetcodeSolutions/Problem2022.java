package org.example.leetcodeSolutions;

public class Problem2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Total items in the original array must fit inside the 2D array.
        // There cant be any overflow or underflow.

        // Steps:
        // 1. Check the size of the 2d array.
        // 2. Check if all the elements fit inside the 2d array.
        // 3. If dosent fit, return empty 2D array, otherwise generate 2D array.

        if(m * n != original.length){
            return new int[0][0];
        }

        int[][] resultArray = new int[m][n];

        int row = 0;
        int col = 0;

        for(int num : original){
            resultArray[row][col] = num;
            col++;

            if(col == n){
                col = 0;
                row++;
            }
        }

        return resultArray;
    }
}
