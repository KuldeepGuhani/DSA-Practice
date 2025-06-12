/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class list {
    
    public static void main(String[] args) {
    int [] arr={1,2,3,4,5};

    int k=1;
    String val="";
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
        arr2.add(i);
        }
        
        for(Integer res:arr2){
            if(res==k){
                System.out.println(" i "+res);
            }
                System.out.println("MO");
            
        }
    }
}
