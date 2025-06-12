/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.util.Arrays;

/**
 *
 * @author root
 * tc -O(nlogn)
 * sc-o(1)
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        
    
    String[] array={"adcb","adcd","adcfe"};
    
    StringBuilder sb=new StringBuilder();
            
    Arrays.sort(array);
    
    char[] first=array[0].toCharArray();
    char[] last=array[array.length-1].toCharArray();
        
    for(int i=0;i<first.length;i++){
        if(first[i]!=last[i])
        break;
        
        sb.append(first[i]);
    }
    
        System.out.println(" "+sb.toString()+" ");
    }
}
