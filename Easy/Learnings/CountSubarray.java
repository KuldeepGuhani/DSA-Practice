package Learnings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class CountSubarray {

    public static void main(String[] args) {
        int[] arr={3,1,2};
        int index=0;
        int n=arr.length;
        int sum=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        System.out.println( "count subarray"+ countSubArray(arr,index,n,sum,ans));
    }


public static ArrayList<Integer> countSubArray(int[] arr,int index,int n,int sum,ArrayList<Integer> ans){
    
    if(index==n){
     ans.add(sum);
    }
    
    countSubArray(arr, index+1,n, sum+arr[index], ans);
    countSubArray(arr, index,n, sum, ans);
    
    return ans;
}
    
}
