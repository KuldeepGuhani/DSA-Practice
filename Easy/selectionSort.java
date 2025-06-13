package DSA_Learnig2025.Sorting;

import java.util.Arrays;

/**
 *
 * ALL About Sorting.
 *
 * @author Kuldeep Guhani
 */
public class allAboutSorting {

    public static void main(String[] args) {

        int[] arr={5,8,47,64,2,1};
//        selectionSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) { //    TC=O(N^2) and SC=O(1).
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; //nothing to change
            int maxi = getMax(arr, 0, last);
            swap(arr, maxi, last);

        }

    }

    static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
    //bubbleSort:
    static void bubbleSort(int[] arr) { //    TC=O(N^2) and SC=O(1). inplace sorting algorithm no array space needed.
       for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int maxi=getMax(arr, 0, last);
           swap(arr, maxi, last);
           
       }
        
    }
    
    //
    

    
}

