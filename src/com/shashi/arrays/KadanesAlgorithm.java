package com.shashi.arrays;

public class KadanesAlgorithm {
    private int[] inputArray = { 1, 6, 3, -4, 7, 9};

    public int findMaxSumSubArray(int[] input) {
        int maxResult = 0;
        int currentSum = 0;

        for ( int i = 0; i < input.length; i++ ) {
            currentSum = currentSum + input[i];

            if ( currentSum > maxResult ) {
                maxResult = currentSum;
            }

            if ( currentSum < 0 ) {
                currentSum = 0;
            }
        }

        return maxResult;
    }
}