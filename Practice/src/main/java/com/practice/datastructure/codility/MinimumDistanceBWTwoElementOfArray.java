package com.practice.datastructure.codility;

import java.util.Arrays;

/**
 * To find minimum distance between any two distinct elements of array
 * To be done in O(n log n) time complexity
 * Idea is to sort the array( takes log n)
 * iterates array and keep track of minimum difference between consecutive elements
 */
public class MinimumDistanceBWTwoElementOfArray {

    public static void main(String[] args) {
        System.out.println(new MinimumDistanceBWTwoElementOfArray().solution(new int[]{9,4,-10,-3}));
    }

    public int solution(int []A){
        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE;
        for(int i =0; i < A.length-1; i++){
            int currentDiff = A[i+1] - A[i];
            if(currentDiff < minDiff){
                minDiff = currentDiff;
            }
        }
        return minDiff;
    }
}
