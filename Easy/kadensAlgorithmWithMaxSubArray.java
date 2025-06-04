package DSA_Learnig2025.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class kadensAlgorithmWithMaxSubArray {

    public static void main(String[] args) {

        //int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr = {3, -4, 2, -3, -1, 7, -5};

        System.out.println("result : " + kadensAlgorithmWithMaxSubArray(arr));

    }

    public static ArrayList kadensAlgorithmWithMaxSubArray(int[] arr) {

        ArrayList array = new ArrayList();
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, tempStart = 0, end = 0;
        System.out.println("maxSum: " + maxSum + " currsum: " + currSum);
        for (int i = 0; i < arr.length; i++) {
            if (currSum == 0) {
                start = i;
            }
            currSum += arr[i];

//            maxSum= Math.max(maxSum, currSum); //direct function to get max value // TC=O(N)// SC=O(1)  
            if (currSum > maxSum) {
                maxSum = currSum;
                tempStart = start;
                end = i;

            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("tempStart: " + tempStart + " end: " + end);
        for (int i = tempStart; i <= end; i++) {
            array.add(arr[i]);

        }

        return array;
    }


//🧠How Kadane’s Builds Intuition:
//Current sum negative? → Drop it, not helpful for max.
//Track best so far → maxSum.
//Handles positives, negatives, and zeros gracefully.
}

