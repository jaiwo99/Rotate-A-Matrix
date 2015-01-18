package com.jaiwo99.algorithm;

/**
 * @author jaiwo99
 */
public class MatrixRotator {

    int[][] rotateClockwise(int[][] input) {

        final int n = input.length;
        int[][] result = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                if(i+j<n-1 && i<=j) {
                    // move right
                    result[i][j+1] = input[i][j];
                } else if(i+j>n-1 && i>=j) {
                    // move left
                    result[i][j-1] = input[i][j];
                } else if(i+j<=n-1 && i>j){
                    // move top
                    result[i-1][j] = input[i][j];
                } else if(i+j>=n-1 && i<j) {
                    // move down
                    result[i+1][j] = input[i][j];
                } else {
                    result[i][j] = input[i][j];
                }
            }
        }
        return result;
    }
}
