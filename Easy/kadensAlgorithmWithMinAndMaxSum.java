package DSA_Learnig2025.Arrays;

public class kadensAlgorithmWithMinAndMaxSum {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("result : " + kadensAlgorithm(arr));

    }

    public static int kadensAlgorithm(int[] arr) {

        int maxSum = Integer.MAX_VALUE;
        int currSum = 0;
        System.out.println("maxSum: " + maxSum + " currsum: " + currSum);

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
//            maxSum= Math.max(maxSum, currSum); //direct function to get max value // TC=O(N)// SC=O(1)  
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }

    public static int kadensAlgorithmMinSum(int[] arr) {
        int minSum=Integer.MAX_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > 0) {
                currSum = 0;
            }
            //            minSum= Math.min(minSum, currSum); //direct function to get min value // TC=O(N) //SC=O(1)  
        }
        return minSum;

    }
    
    
    
    

//🧠How Kadane’s Builds Intuition:
//Current sum negative? → Drop it, not helpful for max.
//Track best so far → maxSum.
//Handles positives, negatives, and zeros gracefully.
}

