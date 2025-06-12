/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author root
 */
public class DuplicateInArray {
    
    
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(removeDuplicates(arr));
        
    }
    
     public static int removeDuplicates(int[] nums) {
              
         int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
            }
            
            nums[i]=nums[j];
            
        }
    return i+1;
   
   }
}

