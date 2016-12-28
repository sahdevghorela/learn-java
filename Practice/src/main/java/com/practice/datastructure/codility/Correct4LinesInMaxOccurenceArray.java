package com.practice.datastructure.codility;

/*
* 4 Lines are required to be changed
* Find max occurred element from the array
 */
public class Correct4LinesInMaxOccurenceArray {

    public static void main(String[] args) {
        System.out.println(new Correct4LinesInMaxOccurenceArray().correctSolution2(3, new int[]{1,2,2}));
    }

    public int incorrectSolution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;// Needlessly initializing array
        int maxOccurence =1; //  Try run with input {1,2,2}
        int index = -1; // index should point to 0
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }

    public int correctSolution1(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        /*for (int i = 0; i <= M; i++)
            count[i] = 0;*/
        int maxOccurence =1;
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                count[A[i]] = count[A[i]] + 1; // increase occurrence and then check
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }

            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }

    public int correctSolution2(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        /*for (int i = 0; i <= M; i++)
            count[i] = 0;*/
        int maxOccurence =0;// maxOccurence should be either 0 or try above solution
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {

                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }
}
