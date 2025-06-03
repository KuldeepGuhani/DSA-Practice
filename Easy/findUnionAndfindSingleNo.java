package DSA_Learnig2025.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findUnionAndfindSingleNo {

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 4, 5}, nums2 = {1, 2, 7};
//        int[] nums1 = {1, 2, 4, 5};int []nums2 = {2, 3, 5, 6};
//        System.out.println(" " + findUnionOPT(nums1, nums2));
        int[] arr={1, 2, 2, 4, 3, 1, 4};
        System.out.println(findSingleNo(arr));
    }

    public static List<Integer> findUnionBRF(int[] arr1, int[] arr2) {

        Set hashset = new HashSet();
        for (int num : arr1) {
            hashset.add(num);
        }
        for (int num2 : arr2) {
            hashset.add(num2);
        }
//        TC=O(N+M) for insert into set
        List<Integer> result = new ArrayList<>(hashset);
        Collections.sort(result); // Maintain sorted order
        return result;
//    O(N + M) to insert into Set
//    O(N log N) for sorting → final: O((N+M) log(N+M))
    }

    public static List<Integer> findUnionOPT(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                addIFNotDuplicate(result, arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                addIFNotDuplicate(result, arr2[j++]);
            } else {
                addIFNotDuplicate(result, arr1[i]);
                i++;
                j++;
            }
        }
        if (i < n) {
            addIFNotDuplicate(result, arr1[i++]);
        }
        if (j < m) {
            addIFNotDuplicate(result, arr2[j++]);
        }
        return result;
    }

    public static void addIFNotDuplicate(List<Integer> result, int value) {
        if (result.isEmpty() || result.get(result.size() - 1) != value) {//check last ele of list is equal to value if not then add it to list that's it and if list is empty then add in list.
            result.add(value);
        }
    }
//    Time: O(n + m) — single pass through both arrays.
//    Space: O(n + m) in the worst case for the result list.
    
    
    
    public static int findSingleNo(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        
        
        return ans;
    }

}

