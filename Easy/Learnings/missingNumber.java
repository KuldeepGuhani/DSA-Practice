/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

/**
 *
 * @author root
 */
public class missingNumber {
    
    public static void main(String[] args) {
        
        int[] nums={3,0,1};
        int xorNums = 0;
        int n = nums.length;
        
      for (int i: nums) {
            xorNums     = xorNums ^ i;
        }
        System.out.println("nms"+xorNums);
      
        }
}
